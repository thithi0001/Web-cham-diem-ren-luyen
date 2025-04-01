//package app.repositories;
//
//package com.drl.repositories;
//
//import com.drl.models.Admin;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface AdminRepository extends JpaRepository<Admin, String> {
//    Optional<Admin> findByEmail(String email);
//    Optional<Admin> findByPhone(String phone);
//    boolean existsByEmail(String email);
//    boolean existsByPhone(String phone);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, String> {
//    User findByUserId(String userId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface RoleRepository extends JpaRepository<Role, Integer> {
//    Optional<Role> findByRoleName(String roleName);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Permission;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PermissionRepository extends JpaRepository<Permission, Integer> {
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student, String> {
//    Optional<Student> findByEmail(String email);
//    Optional<Student> findByPhone(String phone);
//    List<Student> findByIsActive(boolean isActive);
//    List<Student> findByIsGraduated(boolean isGraduated);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Instructor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface InstructorRepository extends JpaRepository<Instructor, String> {
//    Optional<Instructor> findByEmail(String email);
//    Optional<Instructor> findByPhone(String phone);
//    List<Instructor> findByIsActive(boolean isActive);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Class;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface ClassRepository extends JpaRepository<Class, String> {
//    Optional<Class> findByClassName(String className);
//    List<Class> findByDeptId(Integer deptId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.ClassManager;
//import com.drl.models.ClassManagerId;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface ClassManagerRepository extends JpaRepository<ClassManager, ClassManagerId> {
//    List<ClassManager> findByClassId(String classId);
//    List<ClassManager> findBySemId(String semId);
//    List<ClassManager> findByAdvisorId(String advisorId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Department;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface DepartmentRepository extends JpaRepository<Department, Integer> {
//    Optional<Department> findByName(String name);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Semester;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface SemesterRepository extends JpaRepository<Semester, String> {
//    List<Semester> findBySchoolYear(String schoolYear);
//    List<Semester> findBySemester(String semester);
//    List<Semester> findByStartDateBefore(LocalDate date);
//    List<Semester> findByEndDateAfter(LocalDate date);
//    List<Semester> findByStartDateBeforeAndEndDateAfter(LocalDate date, LocalDate sameDate);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Evaluate;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface EvaluateRepository extends JpaRepository<Evaluate, Integer> {
//    List<Evaluate> findByStudentId(String studentId);
//    List<Evaluate> findBySemId(String semId);
//    Optional<Evaluate> findByStudentIdAndSemId(String studentId, String semId);
//    List<Evaluate> findByRating(String rating);
//    List<Evaluate> findBySampleId(String sampleId);
//    List<Evaluate> findByStudentStatus(String status);
//    List<Evaluate> findByBcsStatus(String status);
//    List<Evaluate> findByAdvisorStatus(String status);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Criterion;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CriterionRepository extends JpaRepository<Criterion, String> {
//}
//
//package com.drl.repositories;
//
//import com.drl.models.CriterionPoint;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface CriterionPointRepository extends JpaRepository<CriterionPoint, Integer> {
//    List<CriterionPoint> findByCritId(String critId);
//    List<CriterionPoint> findByEvaluateId(Integer evaluateId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Detail;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface DetailRepository extends JpaRepository<Detail, String> {
//    List<Detail> findByCritId(String critId);
//    List<Detail> findByOrderOrderByOrder(Integer order);
//    List<Detail> findByIsProofNeeded(boolean isProofNeeded);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.DetailPoint;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface DetailPointRepository extends JpaRepository<DetailPoint, Integer> {
//    List<DetailPoint> findByDetailId(String detailId);
//    List<DetailPoint> findByCritPointId(Integer critPointId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Proof;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface ProofRepository extends JpaRepository<Proof, Integer> {
//    List<Proof> findByDetailPointId(Integer detailPointId);
//    List<Proof> findByProofType(String proofType);
//    List<Proof> findByProofStatus(String proofStatus);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.StudentClass;
//import com.drl.models.StudentClassId;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface StudentClassRepository extends JpaRepository<StudentClass, StudentClassId> {
//    List<StudentClass> findByStudentId(String studentId);
//    List<StudentClass> findByClassId(String classId);
//    List<StudentClass> findByStartDateBefore(LocalDate date);
//    List<StudentClass> findByEndDateAfter(LocalDate date);
//    List<StudentClass> findByEndDateIsNull();
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Report;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface ReportRepository extends JpaRepository<Report, Integer> {
//    List<Report> findByClassId(String classId);
//    List<Report> findBySemId(String semId);
//    Optional<Report> findByClassIdAndSemId(String classId, String semId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.Deadline;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface DeadlineRepository extends JpaRepository<Deadline, Integer> {
//    List<Deadline> findByClassId(String classId);
//    List<Deadline> findBySemId(String semId);
//    List<Deadline> findByRoleId(Integer roleId);
//    List<Deadline> findByStartDateBefore(LocalDate date);
//    List<Deadline> findByEndDateAfter(LocalDate date);
//    List<Deadline> findByClassIdAndSemId(String classId, String semId);
//    List<Deadline> findByClassIdAndSemIdAndRoleId(String classId, String semId, Integer roleId);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.SampleForm;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface SampleFormRepository extends JpaRepository<SampleForm, String> {
//    List<SampleForm> findByIsUsing(boolean isUsing);
//}
//
//package com.drl.repositories;
//
//import com.drl.models.FormCriterion;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface FormCriterionRepository extends JpaRepository<FormCriterion, Integer> {
//    List<FormCriterion> findBySampleId(String sampleId);
//    List<FormCriterion> findByCritId(String critId);
//    Optional<FormCriterion> findBySampleIdAndCritId(String sampleId, String critId);
//    List<FormCriterion> findBySampleIdOrderByOrder(String sampleId);
//}
