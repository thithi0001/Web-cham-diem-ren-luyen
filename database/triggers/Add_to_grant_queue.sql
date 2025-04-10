drop trigger add_to_grant_queue_when_add_new_user;
DELIMITER //
CREATE TRIGGER add_to_grant_queue_when_add_new_user
AFTER INSERT ON users
FOR EACH ROW
BEGIN
	DECLARE roleName VARCHAR(20);
    SELECT Role_name INTO roleName
    FROM roles AS R
    WHERE NEW.Role_id = R.Role_id
    LIMIT 1;

	INSERT INTO grant_queue (User_id, Role_name)
    VALUES (NEW.User_id, roleName);
END//
DELIMITER ;

DELIMITER //
CREATE TRIGGER add_to_grant_queue_when_change_user_role
AFTER UPDATE ON users
FOR EACH ROW
BEGIN
	DECLARE roleName VARCHAR(20);
    SELECT Role_name INTO roleName
    FROM roles AS R
    WHERE NEW.Role_id = R.Role_id
    LIMIT 1;

	INSERT INTO grant_queue (User_id, Role_name)
    VALUES (NEW.User_id, roleName);
END//
DELIMITER ;