DELIMITER $$

CREATE TRIGGER Handle_graduated_student
AFTER UPDATE ON STUDENTS
FOR EACH ROW
BEGIN
    IF NEW.Is_graduated = TRUE AND OLD.Is_graduated = FALSE THEN
		UPDATE STUDENTS
        SET Is_active = FALSE
        WHERE Student_id = OLD.Student_id;
    END IF;
END$$

DELIMITER ;