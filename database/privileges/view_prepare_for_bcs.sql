-- current_class_member_info
CREATE OR REPLACE VIEW current_class_member_info AS
SELECT S.Student_id, S.Full_name, S.Bdate, S.Email, S.Phone
FROM students AS S
JOIN student_class AS SC ON SC.Student_id = S.Student_id
WHERE 
	SC.End_date IS NULL AND
	SC.Class_id IN (
		SELECT Class_id
		FROM student_current_class_info
);

-- current_class_member_evaluate
CREATE OR REPLACE VIEW current_class_member_evaluate AS
SELECT E.*
FROM evaluates AS E
JOIN students AS S ON S.Student_id = E.Student_id
WHERE S.Student_id IN (
	SELECT Student_id
    FROM current_class_member_info
);

-- current_class_member_criterion_point
CREATE OR REPLACE VIEW current_class_member_criterion_point AS
SELECT CP.*
FROM criterion_point AS CP
JOIN evaluates AS E ON E.Evaluate_id = CP.Evaluate_id
WHERE E.Evaluate_id IN (
	SELECT Evaluate_id
    FROM current_class_member_evaluate
);

-- current_class_member_detail_point
CREATE OR REPLACE VIEW current_class_member_detail_point AS
SELECT DP.*
FROM detail_point AS DP
JOIN criterion_point AS CP ON CP.Crit_point_id = DP.Crit_point_id
WHERE CP.Crit_point_id IN (
	SELECT Crit_point_id
    FROM current_class_member_criterion_point
);

-- current_class_member_proof
CREATE OR REPLACE VIEW current_class_member_proof AS
SELECT P.*
FROM proofs AS P
JOIN detail_point AS DP ON DP.Detail_point_id = P.Detail_point_id
WHERE P.Detail_point_id IN (
	SELECT Detail_point_id
    FROM current_class_member_detail_point
);

-- class_report_history
CREATE OR REPLACE VIEW class_report_history AS
SELECT R.*
FROM reports AS R
JOIN classes AS C ON C.Class_id = R.Class_id
WHERE C.Class_id IN (
	SELECT Class_id
    FROM student_current_class_info
);