package ir.store.controller.servlet;

import ir.store.model.entity.Person;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


@Controller
@Path("person")
@View("person.jsp")
public class PersonController {
//    @Inject
//    Person person;
//    @GET
//    public String hello()
//    {
//        return "index.jsp";
//    }

    @GET
    @Path("void")
    @View("personForm.jsp")
    @Produces("text/html")
    public String showForm() {
        System.out.println("Get Api");
        return "GET";
    }
//
//    @GET
//    @Path("string")
//    @Produces("text/html")
//    public void showModal() {
////        getModalData();
//    }
}
