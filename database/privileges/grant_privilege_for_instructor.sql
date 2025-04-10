GRANT SELECT ON user_own_info TO role_instructor;
GRANT SELECT ON instructor_own_info TO role_instructor;
GRANT SELECT ON departments TO role_instructor;
GRANT SELECT ON semesters TO role_instructor;
GRANT SELECT ON advised_class_history TO role_instructor;
GRANT SELECT ON advised_class_report TO role_instructor;

show grants for role_instructor;