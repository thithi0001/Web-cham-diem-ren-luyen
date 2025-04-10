package app.services;

import app.models.Students;
import app.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Optional<Students> getStudentById(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    public Students getStudentOrThrow(String studentId) {
        return studentRepository.findByStudentId(studentId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sinh viên có mssv: " + studentId));
    }
//    void uploadProof(String studentId, ProofDto proofDto);
//    void updateProof(String studentId, Integer proofId, ProofDto proofDto);
//    void deleteProof(String studentId, Integer proofId);
//    List<ProofDto> getOwnProof(String studentId);

}
