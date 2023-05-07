package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "attachmentEntity")
@Table(name="attachment_tbl")
public class Attachment extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String title;
}
