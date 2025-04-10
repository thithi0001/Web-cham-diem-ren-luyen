DELIMITER $$

CREATE PROCEDURE sp_GetEvaluatesOfClassBySemester(
	IN classId VARCHAR(20),
    IN semId VARCHAR(20)
)
BEGIN
	SELECT 
        S.Full_name,
        E.*
	FROM evaluates AS E
	JOIN students AS S ON E.Student_id = S.Student_id
	JOIN semesters AS SM ON E.Sem_id = SM.Sem_id
	JOIN student_class AS SC ON SC.Student_id = S.Student_id
	WHERE 
		SC.Class_id = classId AND 
        E.Sem_id = semId AND 
        SC.Start_date <= SM.Start_date AND 
        (SC.End_date >= SM.End_date OR SC.End_date IS NULL);
END$$

DELIMITER ;

-- CALL sp_GetEvaluatesOfClassBySemester('D22CQCN02-N', '2425-2');

-- DROP PROCEDURE sp_GetEvaluatesOfClassBySemester;