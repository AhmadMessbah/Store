package ir.store.model;


import ir.store.model.entity.Attachment;
import ir.store.model.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        Attachment personPic = new Attachment("Person Pic");
//        Person person = new Person("Ahmad");
//        person.setAttachment(personPic);
//
//        Role role = new Role("Manager");
//
//        User user = new User("ahmad", "ahmad123");
//        user.setPerson(person);
//        user.setRole(role);
//
//        CrudRepository<User, Long> userDa = new CrudRepository<>();
//        System.out.println(userDa.insert(user));

//        Group group = new Group("Main");
//
//        Group group11 = new Group("Sub Main 1");
//        group11.setParent(group);
//
//        Group group12 = new Group("Sub Main 2");
//        group12.setParent(group);
//
//        Group group121 = new Group("Sub Main 1 2 1");
//        group121.setParent(group12);

//        CrudRepository<Group, Long> groupDa = new CrudRepository<>();
//        group121 = groupDa.insert(group121);
//
//        Group group122 = new Group("Sub Main 1 2 2");
//        group122.setParent(group12);

//        Group temp = group122;
//        while (temp.getParent() != null){
//            System.out.println(temp.getName());
//            temp = temp.getParent();
//        }
//        System.out.println(temp.getName());

//        Unit unit = new Unit("Device");
//
//
//        Attachment attachment1 = new Attachment("Stuff Pic 1");
//        Attachment attachment2 = new Attachment("Stuff Pic 2");
//        List<Attachment> attachments = new ArrayList<>();
//
//        CrudRepository<Attachment, Long> attachmentDa = new CrudRepository<>();
////        System.out.println(attachmentDa.insert(attachment1));
////        System.out.println(attachmentDa.insert(attachment2));
//        System.out.println("------------------------------------------------");
//        System.out.println((AttachmentService.getService().save(attachment1)));
//        System.out.println(AttachmentService.getService().save(attachment2));
////        System.out.println(AttachmentService.getService().findAll());
////        System.out.println(AttachmentService.getService().findById(1));
//        System.out.println("------------------------------------------------");
//        System.out.println(AttachmentService.getService().remove(attachment2));
//        System.out.println(attachment2.isDeleted());
//        System.out.println("------------------------------------------------");
////        System.out.println(AttachmentService.getService().save(attachment2));
//
////        AttachmentService.getService().remove(1);
//
//        Stuff stuff1 = new Stuff("Laptop", 2000);
////        attachments.add(attachment1);
////        attachments.add(attachment2);
////        stuff1.setAttachment(attachments);
//        stuff1.setGroup(group121);
//        stuff1.setUnit(unit);
//
//        Stuff stuff2 = new Stuff("Mobile", 1000);
//        stuff2.setGroup(group122);
//        stuff2.setUnit(unit);
////
////        CrudRepository<Stuff, Long> stuffDa = new CrudRepository<>();
////        System.out.println(stuffDa.insert(stuff));
//
//        Attachment attachment = new Attachment("Factor Pic");
//        Invoice invoice = new Invoice("Faktor");
//
//        InvoiceItem invoiceItem1 = new InvoiceItem();
//        invoiceItem1.setCount(2);
//        invoiceItem1.setStuff(stuff1);
//
//        InvoiceItem invoiceItem2 = new InvoiceItem();
//        invoiceItem2.setCount(3);
//        invoiceItem2.setStuff(stuff2);
//
//        List<InvoiceItem> invoiceItems = new ArrayList<>();
//        invoiceItems.add(invoiceItem1);
//        invoiceItems.add(invoiceItem2);
//
//        invoice.setInvoiceItem(invoiceItems);
//        invoice.setPerson(person);
//        invoice.setUser(user);
//
//
//        Payment payment = new Payment("Pardakhtha");
//        payment.setPaymentType(PaymentType.Combine);
//
//        List<Check> checkList = new ArrayList<>();
//        checkList.add(new Check("Mellat", 500));
//        checkList.add(new Check("Melli", 800));
//        payment.setCheckList(checkList);
//
//        List<Cash> cashList = new ArrayList<>();
//        cashList.add(new Cash("Cash", 1500));
//        cashList.add(new Cash("Travel", 1200));
//        payment.setCashList(cashList);
//
//        List<Card> cardList = new ArrayList<>();
//        cardList.add(new Card("Saman", 1500));
//        cardList.add(new Card("EN", 1200));
//        payment.setCardList(cardList);
//
////        CrudRepository<Payment, Long> paymentDa = new CrudRepository<>();
////        paymentDa.insert(payment);
//
//        invoice.setPayment(payment);
//
//
//        CrudRepository<Invoice, Long> invoiceDa = new CrudRepository<>();
//        System.out.println(invoiceDa.insert(invoice));
////        invoiceDa.delete(Invoice.class, 1L);

    }
}
