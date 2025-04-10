-- instructor_own_info
CREATE OR REPLACE VIEW instructor_own_info AS
SELECT *
FROM instructors
WHERE User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);

-- advised_class_history
CREATE OR REPLACE VIEW advised_class_history AS
SELECT C.Class_id, C.Class_name, D.Name AS Departmant_name, CM.Sem_id
FROM classes AS C
JOIN class_managers AS CM ON CM.Class_id = C.Class_id
JOIN instructors AS I ON I.Instructor_id = CM.Advisor_id
JOIN departments AS D ON D.Dept_id = C.Dept_id
WHERE I.User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);

-- advised_class_report
CREATE OR REPLACE VIEW advised_class_report AS
SELECT R.*
FROM reports AS R
JOIN advised_class_history USING (Class_id, Sem_id);

-- user_own_info
-- department
-- semester
