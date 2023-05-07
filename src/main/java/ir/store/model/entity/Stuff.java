package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "stuffEntity")
@Table(name="stuff_tbl")
public class Stuff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    @NonNull
    private int price ;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Attachment> attachment;

    @OneToOne(cascade = CascadeType.ALL)
    private Group group;

    @OneToOne(cascade = CascadeType.ALL)
    private Unit unit;

}
