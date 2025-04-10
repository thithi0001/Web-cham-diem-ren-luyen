package app.services;

import app.dto.StudentDTO;
import app.mapper.StudentMapper;
import app.models.Students;
import app.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    public Optional<Students> getStudentById(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    public Students getStudentOrThrow(String studentId) {
        return studentRepository.findByStudentId(studentId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sinh viên có mssv: " + studentId));
    }

    public StudentDTO getStudentDTO(String studentId) {
        Students student = studentRepository.findByStudentId(studentId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sinh viên"));

        return studentMapper.toDto(student);
    }
//    void uploadProof(String studentId, ProofDto proofDto);
//    void updateProof(String studentId, Integer proofId, ProofDto proofDto);
//    void deleteProof(String studentId, Integer proofId);
//    List<ProofDto> getOwnProof(String studentId);

}
