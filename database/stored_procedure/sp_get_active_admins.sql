DELIMITER $$

CREATE PROCEDURE get_active_admins()
BEGIN
	SELECT *
    FROM admins
    WHERE Is_active = true;
END$$

DELIMITER ;