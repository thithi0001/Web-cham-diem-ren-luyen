package app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String studentId;
    private String fullName;
    private String birthDate;
    private String email;
    private String phone;
}

