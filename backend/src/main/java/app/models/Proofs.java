package app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proofs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proofs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong gia tang
    @Column(name = "Proof_id")
    private Integer proofId;

    @ManyToOne
    @JoinColumn(name = "Detail_point_id")
    private Detail_point detailPoint;

    @Enumerated(EnumType.STRING)
    @Column(name = "Proof_type", nullable = false)
    private ProofType proofType;

    @Column(name = "File_url", length = 500) // gioi han do dai
    private String fileUrl;

    @Column(name = "Description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "Proof_status", columnDefinition = "varchar(20) default Pending")
    private ProofStatus status = ProofStatus.Pending;
}
