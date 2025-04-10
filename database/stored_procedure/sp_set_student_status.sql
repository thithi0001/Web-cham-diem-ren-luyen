DELIMITER //

CREATE PROCEDURE set_student_graduate(
	IN studentId VARCHAR(20)
)
BEGIN
	UPDATE students
    SET Is_graduated = TRUE
    WHERE Student_id = studentId;
END//

DELIMITER ;

DELIMITER //

CREATE PROCEDURE set_student_active_status(
	IN studentId VARCHAR(20),
    IN status BOOL
)
BEGIN
	UPDATE students
    SET Is_active = status
    WHERE Student_id = studentId;
END//

DELIMITER ;

drop procedure set_student_active_status;