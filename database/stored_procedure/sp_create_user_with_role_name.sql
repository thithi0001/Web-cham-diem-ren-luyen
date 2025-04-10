drop procedure create_user_with_role_name;

DELIMITER //

CREATE PROCEDURE create_user_with_role_name(
	IN uid VARCHAR(20), 
    IN roleName VARCHAR(20),
    IN id VARCHAR(20),
    IN fullName VARCHAR(50),
    IN bDate DATE,
    IN gender ENUM('Male', 'Female'),
    IN email VARCHAR(255),
    IN phone VARCHAR(10)
)
BEGIN
	DECLARE roleId INT;
    DECLARE _password VARCHAR(20);
    SET _password = DATE_FORMAT(bDate, "%d%m%Y");
    SELECT Role_id INTO roleId
    FROM roles
    WHERE Role_name = roleName
    LIMIT 1;

	INSERT INTO users(User_id, Pwd, Role_id)
    VALUES (uid, _password, roleId);
    
    IF roleName = 'role_admin' THEN
		INSERT INTO admins(Admin_id, User_id, Full_name, Bdate, Gender, Email, Phone)
        VALUES (id, uid, fullName, bDate, gender, email, phone);
    END IF;
    
    IF roleName = 'role_instructor' THEN
		INSERT INTO instructors(Instructor_id, User_id, Full_name, Bdate, Gender, Email, Phone)
        VALUES (id, uid, fullName, bDate, gender, email, phone);
    END IF;
    
    IF roleName = 'role_student' THEN
		INSERT INTO students(Student_id, User_id, Full_name, Bdate, Gender, Email, Phone)
        VALUES (id, uid, fullName, bDate, gender, email, phone);
    END IF;
END//

DELIMITER ;