DELIMITER $$

CREATE PROCEDURE get_active_instructors()
BEGIN
	SELECT *
    FROM instructors
    WHERE Is_active = true;
END$$

DELIMITER ;