package ir.store.model.entity;

import ir.store.model.entity.enums.PaymentType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name="paymentEntity")
@Table(name="payment_tbl")
public class Payment {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> cardList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Cash> cashList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Check> checkList;

    private int amount;

    @PrePersist
    @PreUpdate
    private void calculateAmount(){
        amount = 0;
        for (Check check : checkList) {
            amount += check.getAmount();
        }

        for (Card card : cardList) {
            amount += card.getAmount();
        }

        for (Cash cash : cashList) {
            amount += cash.getAmount();
        }
    }
}
