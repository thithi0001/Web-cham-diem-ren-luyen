DELIMITER $$

CREATE TRIGGER Handle_inactive_student
AFTER UPDATE ON STUDENTS
FOR EACH ROW
BEGIN
	IF NEW.Is_active = FALSE AND OLD.Is_active = TRUE THEN
		UPDATE CLASSES
		SET Current_num_of_students = Current_num_of_students - 1
		WHERE Class_id = (
			SELECT Class_id
			FROM STUDENT_CLASS
			WHERE Student_id = NEW.Student_id AND End_date IS NULL
		);
		
		UPDATE STUDENT_CLASS
        SET End_date = current_date()
        WHERE Student_id = NEW.Student_id AND End_date IS NULL;
	END IF;
END$$

DELIMITER ;