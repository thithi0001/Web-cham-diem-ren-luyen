DELIMITER //

CREATE PROCEDURE change_user_password(
	IN uid VARCHAR(20),
    IN newPwd VARCHAR(20)
)
BEGIN
	UPDATE users
    SET Pwd = newPwd
    WHERE User_id = uid;
END//

DELIMITER ;