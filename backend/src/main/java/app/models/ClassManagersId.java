package app.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClassManagersId implements Serializable {
    private String classId;
    private String semId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassManagersId that = (ClassManagersId) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(semId, that.semId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, semId);
    }
}
