DELIMITER //

CREATE PROCEDURE get_active_admins()
BEGIN
	SELECT *
    FROM admins
    WHERE Is_active = true;
END//

CREATE PROCEDURE get_active_instructors()
BEGIN
	SELECT *
    FROM instructors
    WHERE Is_active = true;
END//

CREATE PROCEDURE get_active_students()
BEGIN
	SELECT *
    FROM students
    WHERE Is_active = true;
END//
DELIMITER ;