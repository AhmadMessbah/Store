package ir.store.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data


@Entity(name= "invoiceEntity")
@Table(name="invoice_tbl")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Attachment> attachment;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<InvoiceItem> invoiceItem;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    private int amount;

    private int paid;

    private int remained;

    private LocalDateTime invoiceTimeStamp;

    @PrePersist
    @PreUpdate
    private void calculateAmount(){
        amount = 0;
        for (InvoiceItem item : invoiceItem) {
            amount += item.getCount() * item.getStuff().getPrice();
        }

        paid = payment.getAmount();

        remained = amount - paid;

        invoiceTimeStamp = LocalDateTime.now();
    }


}
