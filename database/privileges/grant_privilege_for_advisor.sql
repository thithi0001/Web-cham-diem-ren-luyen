GRANT role_instructor TO role_advisor;

GRANT SELECT ON advising_class TO role_advisor;
GRANT SELECT ON advising_deadline TO role_advisor;
GRANT SELECT ON advising_report TO role_advisor;
GRANT SELECT ON advising_student TO role_advisor;
GRANT SELECT ON advising_student_evaluate TO role_advisor;
GRANT SELECT ON advising_student_criterion_point TO role_advisor;
GRANT SELECT ON advising_student_detail_point TO role_advisor;
GRANT SELECT ON advising_student_proof TO role_advisor;

show grants for role_advisor;