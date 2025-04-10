call drl_database.create_user_with_role_name('user00001', 'role_admin', 'admin1', 
'Lê Đình Thi', '2004-01-01', 'Male', 'ledinhthi0001@gmail.com', '0123456789');

call drl_database.create_user_with_role_name('user00002', 'role_student', 'N22DCCN179', 
'Lê Đình Thi', '2004-01-01', 'Male', 'n22dccn179@student.ptithcm.edu.vn', '0123456789');

call drl_database.create_user_with_role_name('user00003', 'role_student', 'N22DCCN000', 
'Nguyễn Văn A', '2004-04-07', 'Male', 'n22dccn000@student.ptithcm.edu.vn', '0000000000');

-- tao user voi role khong ton tai thi se khong the thuc hien
call drl_database.create_user_with_role_name('user00004', 'role_singer', 'N22DCCN999', 
'Nguyễn Văn B', '2004-07-01', 'Male', 'n22dccn999@student.ptithcm.edu.vn', '0999999999');

