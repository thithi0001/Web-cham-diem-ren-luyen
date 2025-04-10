-- advising_class
CREATE OR REPLACE VIEW advising_class AS
SELECT C.Class_id, C.Class_name, D.Name AS Department_name, C.Current_num_of_students, S.Sem_id
FROM classes AS C
JOIN class_managers AS CM ON CM.Class_id = C.Class_id
JOIN semesters AS S ON S.Sem_id = CM.Sem_id
JOIN departments AS D ON D.Dept_id = C.Dept_id
WHERE 
	S.Sem_id = (
		SELECT MAX(S2.Start_date)
        FROM semesters AS S2
    ) 
    AND
	C.Class_id IN (
	SELECT Class_id
    FROM advised_class_history
);

-- advising_student
CREATE OR REPLACE VIEW advising_student AS
SELECT S.Student_id, S.Full_name, S.Bdate, S.Email, S.Phone
FROM students AS S
JOIN student_class AS SC ON SC.Student_id = S.Student_id
JOIN advising_class AS AC ON AC.Class_id = SC.Class_id
WHERE SC.End_date IS NULL;

-- advising_student_evaluate
CREATE OR REPLACE VIEW advising_student_evaluate AS
SELECT E.*
FROM evaluates AS E
JOIN advising_student AS ADS ON ADS.Student_id = E.Student_id
JOIN advising_class AS AC ON AC.Sem_id = E.Sem_id;

-- advising_student_criterion_point
CREATE OR REPLACE VIEW advising_student_criterion_point AS
SELECT CP.*
FROM criterion_point AS CP
JOIN advising_student_evaluate AS ASE ON ASE.Evaluate_id = CP.Evaluate_id;

-- advising_student_detail_point
CREATE OR REPLACE VIEW advising_student_detail_point AS
SELECT DP.*
FROM detail_point AS DP
JOIN advising_student_criterion_point AS ACP on ACP.Crit_point_id = DP.Crit_point_id;

-- advising_student_proof
CREATE OR REPLACE VIEW advising_student_proof AS
SELECT P.*
FROM proofs AS P
JOIN detail_point AS DP ON DP.Detail_point_id = P.Detail_point_id
WHERE P.Detail_point_id IN (
	SELECT Detail_point_id
    FROM advising_student_detail_point
);

-- advising_deadline
CREATE OR REPLACE VIEW advising_deadline AS
SELECT D.*
FROM deadlines AS D
JOIN advising_class USING (Class_id, Sem_id);

-- advising_report
CREATE OR REPLACE VIEW advising_report AS
SELECT R.*
FROM reports AS R
JOIN advising_class USING (Class_id, Sem_id);
