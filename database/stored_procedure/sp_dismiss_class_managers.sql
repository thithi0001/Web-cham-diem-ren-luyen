DELIMITER $$

CREATE PROCEDURE dismiss_class_managers (
	IN classId VARCHAR(20), 
    IN semId VARCHAR(20)
)
BEGIN
	DECLARE instructorId VARCHAR(20);
	DECLARE iUserId VARCHAR(20);
    DECLARE advisingClass INT;
    
    SELECT Instructor_id INTO instructorId
	FROM class_managers
	WHERE Class_id = classId AND Sem_id = semId
	LIMIT 1;
    
    SELECT COUNT(*) INTO advisingClass
	FROM class_managers
    WHERE Class_id = classId AND Sem_id = semId AND Advisor_id = instructorId;
    
    SELECT User_id INTO iUserId
    FROM instructors
    WHERE Instructor_id = instructorId
    LIMIT 1;
    
    IF advisingClass = 1 THEN
		UPDATE users
		SET Role_id = 3 -- role_instructor
		WHERE User_id = iUserId;
	END IF;
    
    UPDATE users
    SET Role_id = 2 -- role_student
    WHERE User_id = (
		SELECT User_id
        FROM students AS S, class_managers AS CM
        WHERE 
			(S.Student_id = CM.LT_id OR S.Student_id = CM.LP_id) AND
            CM.Class_id = classId AND
            CM.Sem_id = semId
    );
END$$

DELIMITER ;
