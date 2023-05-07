package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "personEntity")
@Table(name="person_tbl")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Attachment attachment;


}
