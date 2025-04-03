package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sample_form")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sample_form {
    @Id
    @Column(name = "Sample_id")
    private String sampleId;

    @Column(name = "Is_using", nullable = false)
    private boolean isUsing;
}
