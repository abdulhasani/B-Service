package com.bebrayan.ngapak.core.service;


import com.bebrayan.ngapak.core.model.PersonModel;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hasani
 */
@Path("/service/person")
public class PersonService {
    
    @GET
    @Path("/{requestId}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonModel getSingle(@PathParam("requestId") String param){
        PersonModel person = new PersonModel();
        person.setRequestId(param);
        person.setFullName("Abdul Kadir Hasani");
        person.setFirstName("Abdul");
        person.setMiddleName("Kadir");
        person.setLastName("Hasani");
        person.setAge(24);

        return person;
    }
}
