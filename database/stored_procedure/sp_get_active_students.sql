DELIMITER $$

CREATE PROCEDURE get_active_students()
BEGIN
	SELECT *
    FROM students
    WHERE Is_active = true;
END$$

DELIMITER ;