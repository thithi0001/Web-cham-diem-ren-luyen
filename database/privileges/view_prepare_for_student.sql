-- student_own_info
CREATE OR REPLACE VIEW student_own_info AS
SELECT *
FROM students
WHERE User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);

-- student_class_history
CREATE OR REPLACE VIEW student_own_class_history AS
SELECT C.Class_id, C.Class_name, D.Name AS Department_name, SC.Start_date, SC.End_date
FROM classes AS C
JOIN student_class AS SC ON C.Class_id = SC.Class_id
JOIN students AS S ON S.Student_id = SC.Student_id
JOIN departments AS D ON D.Dept_id = C.Dept_id
WHERE S.User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);

-- student_current_class
CREATE OR REPLACE VIEW student_current_class_info AS
SELECT Class_id, Class_name, Department_name, Start_date
FROM student_own_class_history
WHERE End_date IS NULL;

-- current_class_managers_info
CREATE OR REPLACE VIEW current_class_managers_info AS
SELECT I.Instructor_id AS CM_id, I.Full_name, I.Email, I.Phone, 'CVHT' AS _Role
FROM instructors AS I
JOIN class_managers AS CM ON CM.Advisor_id = I.Instructor_id
WHERE CM.Class_id IN (
	SELECT Class_id
    FROM student_current_class_info
)
UNION
SELECT S.Student_id AS CM_id, S.Full_name, S.Email, S.Phone, 'LT' AS _Role
FROM students AS S
JOIN class_managers AS CM ON CM.LT_id = S.Student_id
WHERE CM.Class_id IN (
	SELECT Class_id
    FROM student_current_class_info
)
UNION
SELECT S.Student_id AS CM_id, S.Full_name, S.Email, S.Phone, 'LP' AS _Role
FROM students AS S
JOIN class_managers AS CM ON CM.LP_id = S.Student_id
WHERE CM.Class_id IN (
	SELECT Class_id
    FROM student_current_class_info
);

-- user_own_info
CREATE OR REPLACE VIEW user_own_info AS
SELECT User_id, Pwd
FROM users
WHERE User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);

-- student_own_evaluate, tat ca cac ban danh gia qua cac hoc ky
CREATE OR REPLACE VIEW student_own_evaluate AS
SELECT E.*
FROM evaluates AS E
JOIN students AS S ON S.Student_id = E.Student_id
WHERE S.User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);
	
-- student_own_criterion_point
CREATE OR REPLACE VIEW student_own_criterion_point AS
SELECT CP.*
FROM criterion_point AS CP
JOIN evaluates AS E ON E.Evaluate_id = CP.Evaluate_id
WHERE E.Evaluate_id IN (
	SELECT Evaluate_id
    FROM student_own_evaluate
);

-- student_own_detail_point
CREATE OR REPLACE VIEW student_own_detail_point AS
SELECT DP.*
FROM detail_point AS DP
JOIN criterion_point AS CP ON CP.Crit_point_id = DP.Crit_point_id
WHERE CP.Crit_point_id IN (
	SELECT Crit_point_id
    FROM student_own_criterion_point
);

-- student_own_proof
CREATE OR REPLACE VIEW student_own_proof AS
SELECT P.*
FROM proofs AS P
JOIN detail_point AS DP ON DP.Detail_point_id = P.Detail_point_id
WHERE P.Detail_point_id IN (
	SELECT Detail_point_id
    FROM student_own_detail_point
); 

-- deadline, deadline cua cac vai tro trong lop hien tai
CREATE OR REPLACE VIEW deadline_view AS
SELECT * FROM deadlines
WHERE Class_id IN (
	SELECT Class_id
    FROM student_current_class_info
);

--
CREATE OR REPLACE VIEW a_whole_evaluate AS
SELECT E.
FROM evaluates AS E

-- department
-- semester

-- select SUBSTRING_INDEX(CURRENT_USER(), '@', 1);