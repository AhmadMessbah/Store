package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "unitEntity")
@Table(name="unit_tbl")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String unit;
}
