package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name="CheckEntity")
@Table(name="check_tbl")
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String bank;

    @NonNull
    private int amount;

    private boolean passed = false;
}
