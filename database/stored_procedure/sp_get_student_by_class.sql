DELIMITER $$
-- tra ve thong tin sinh vien hien tai dang theo hoc cua lop, tuc la hoc ky hien tai
CREATE PROCEDURE sp_GetStudentsByClass(
	IN classId VARCHAR(20)
)
BEGIN
	SELECT 
		C.Class_id, 
        S.*
    FROM students AS S
    JOIN student_class AS SC ON S.Student_id = SC.Student_id
	JOIN classes AS C ON C.Class_id = SC.Class_id
	WHERE 
		C.Class_id = classId AND 
		S.Student_id = SC.Student_id AND 
        SC.End_date IS NULL AND 
        S.Is_active = TRUE
	ORDER BY S.Student_id;
END$$

DELIMITER ;

-- CALL sp_GetStudentsByClass('D22CQCN02-N');

-- DROP PROCEDURE sp_GetStudentsByClass;