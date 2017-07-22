package com.bebrayan.ngapak.core.service;


import com.bebrayan.ngapak.core.model.PersonModel;
import java.util.ArrayList;
import java.util.List;
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
    
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonModel> getList(){
        List<PersonModel> models = new ArrayList<PersonModel>();
        
        PersonModel abdul = new PersonModel();
        abdul.setRequestId("1");
        abdul.setFullName("Abdul Kadir Hasani");
        abdul.setFirstName("Abdul");
        abdul.setMiddleName("Kadir");
        abdul.setLastName("Hasani");
        abdul.setAge(24);
        models.add(abdul);
        
        PersonModel bridge = new PersonModel();
        bridge.setRequestId("2");
        bridge.setFullName("Bridge Hasani");
        bridge.setFirstName("Bridge");
        bridge.setMiddleName(null);
        bridge.setLastName("Hasani");
        bridge.setAge(24);
        models.add(bridge);
        
        PersonModel joker = new PersonModel();
        joker.setRequestId("3");
        joker.setFullName("Joker Hasani");
        joker.setFirstName("Joker");
        joker.setMiddleName(null);
        joker.setLastName("Hasani");
        joker.setAge(24);
        models.add(joker);
        
        return models;
    }
}
