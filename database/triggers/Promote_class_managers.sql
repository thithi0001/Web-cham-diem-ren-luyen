DELIMITER $$

CREATE TRIGGER Promote_class_managers
AFTER INSERT ON CLASS_MANAGERS
FOR EACH ROW
BEGIN
	UPDATE USERS
    SET Role_id = 5 -- role_advisor
    WHERE User_id = (
		SELECT User_id
        FROM INSTRUCTORS
        WHERE NEW.Advisor_id = Instructor_id
    );
    
    UPDATE USERS
    SET Role_id = 4 -- role_bcs
    WHERE User_id = (
		SELECT User_id
        FROM STUDENTS
        WHERE Student_id = NEW.LT_id OR Student_id = NEW.LP_id
    );
END$$

DELIMITER ;