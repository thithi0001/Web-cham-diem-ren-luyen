//package app.services;
//
//import app.models.GrantQueue;
//import app.repositories.GrantQueueRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//@Service
//public class GrantService {
//
//    @Autowired
//    private GrantQueueRepository grantQueueRepository;
//
//    @Autowired
//    private DataSource dataSource;
//
//    public String grantPrivileges() {
//        List<GrantQueue> queue = grantQueueRepository.findByIsGrantedFalse();
//        int success = 0;
//
//        try (Connection conn = dataSource.getConnection()) {
//            for (GrantQueue entry : queue) {
//                String user = entry.getUserId();
//                String role = entry.getRoleName();
//
//                String grantSql = "GRANT " + role + " TO '" + user + "'@'localhost'";
//                String setDefaultSql = "SET DEFAULT ROLE " + role + " TO '" + user + "'@'localhost'";
//
//                try (Statement stmt = conn.createStatement()) {
//                    stmt.execute(grantSql);
//                    stmt.execute(setDefaultSql);
//
//                    entry.setGranted(true);
//                    grantQueueRepository.save(entry);
//                    success++;
//                } catch (SQLException ex) {
//                    System.err.println("Lỗi khi cấp quyền cho " + user + ": " + ex.getMessage());
//                }
//            }
//        } catch (SQLException e) {
//            return "Không thể kết nối MySQL: " + e.getMessage();
//        }
//
//        return "Đã cấp quyền thành công cho " + success + " user.";
//    }
//}
//
