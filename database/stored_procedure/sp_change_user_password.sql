drop procedure change_user_password;

DELIMITER //

CREATE PROCEDURE change_user_password(
	IN uid VARCHAR(20),
    IN newPwd VARCHAR(20)
)
BEGIN
	UPDATE users
    SET Pwd = newPwd
    WHERE User_id = SUBSTRING_INDEX(CURRENT_USER(), '@', 1);
END//

DELIMITER ;