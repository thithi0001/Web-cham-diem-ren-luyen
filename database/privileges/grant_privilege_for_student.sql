GRANT SELECT ON student_own_info TO role_student;
GRANT SELECT ON student_own_class_history TO role_student;
GRANT SELECT ON student_current_class_info TO role_student;
GRANT SELECT ON current_class_managers_info TO role_student;
GRANT SELECT ON user_own_info TO role_student;
GRANT SELECT ON student_own_evaluate TO role_student;
GRANT SELECT ON student_own_criterion_point TO role_student;
GRANT SELECT ON student_own_detail_point TO role_student;
GRANT SELECT ON student_own_proof TO role_student;
GRANT SELECT ON deadline_view TO role_student;
GRANT SELECT ON departments TO role_student;
GRANT SELECT ON semesters TO role_student;

show grants for role_student;