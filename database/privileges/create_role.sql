CREATE ROLE 'role_admin';
CREATE ROLE 'role_instructor';
CREATE ROLE 'role_advisor';
CREATE ROLE 'role_bcs';
CREATE ROLE 'role_student';

GRANT ALL PRIVILEGES ON drl_database.* TO 'role_admin';

show grants for 'role_admin';
