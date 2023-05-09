package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name="cashEntity")
@Table(name="cash_tbl")
@DiscriminatorValue("cash")
public class Cash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String cash;

    @NonNull
    private int amount;
}
