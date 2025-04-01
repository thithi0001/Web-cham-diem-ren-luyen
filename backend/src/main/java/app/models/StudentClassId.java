package app.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentClassId implements Serializable {
    private String studentId;
    private String classId;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClassId that = (StudentClassId) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(classId, that.classId) &&
                Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, classId, startDate);
    }
}
