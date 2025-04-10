GRANT role_student TO role_bcs;

GRANT SELECT ON current_class_member_info TO role_bcs;
GRANT SELECT ON current_class_member_evaluate TO role_bcs;
GRANT SELECT ON current_class_member_criterion_point TO role_bcs;
GRANT SELECT ON current_class_member_detail_point TO role_bcs;
GRANT SELECT ON current_class_member_proof TO role_bcs;
GRANT SELECT ON class_report_history TO role_bcs;

show grants for role_bcs;