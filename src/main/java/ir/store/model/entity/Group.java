package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "groupEntity")
@Table(name="group_tbl")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Group parent;
}
