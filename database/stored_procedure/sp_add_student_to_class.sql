drop procedure add_student_to_class;

DELIMITER $$

CREATE PROCEDURE add_student_to_class (
	IN classId VARCHAR(20),
    IN studentId VARCHAR(20)
)
BEGIN
	IF NOT EXISTS (
		SELECT 1 FROM student_class 
		WHERE Class_id = classId AND Student_id = studentId AND End_date IS NULL
	) THEN
		INSERT INTO student_class(Class_id, Student_id, Start_date)
		VALUES (classId, studentId, CURDATE());
	END IF;
END$$

DELIMITER ;
