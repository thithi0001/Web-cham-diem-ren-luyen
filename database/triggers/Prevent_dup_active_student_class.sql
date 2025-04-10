DELIMITER $$

CREATE TRIGGER Prevent_duplicate_active_student_class
BEFORE INSERT ON STUDENT_CLASS
FOR EACH ROW
BEGIN
    IF EXISTS (
        SELECT 1 
        FROM STUDENT_CLASS 
        WHERE Student_id = NEW.Student_id 
          AND End_date IS NULL
    ) THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'A student cannot be added to a new class while they have an active class (End_date is NULL)';
    END IF;
END $$

DELIMITER ;
