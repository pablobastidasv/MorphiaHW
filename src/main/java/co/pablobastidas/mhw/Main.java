package co.pablobastidas.mhw;

import co.pablobastidas.mhw.dao.PersonaDAO;
import co.pablobastidas.mhw.helpers.DatastoreFactory;
import co.pablobastidas.mhw.model.Account;
import co.pablobastidas.mhw.model.Name;
import co.pablobastidas.mhw.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.Datastore;

public class Main {
    public static void main(String[] args) {
        Datastore ds = DatastoreFactory.create();
        
        PersonaDAO dao = new PersonaDAO(ds);
        
        Persona persona = crearPersona();
        
        dao.save(persona);
    }

    private static Persona crearPersona() {
        Persona persona = new Persona();
        persona.setGuid("19efd152-2811-494d-8dc1-24f8cbf0b0f8");
        persona.setIsActive(false);
        persona.setPicture("http://placehold.it/32x32");
        persona.setAge(28);
        persona.setEyeColor("green");
        
        Name name = new Name();
        name.setFirst("Hess");
        name.setLast("Bernand");
        persona.setName(name);
        
        persona.setCompany("OMNIGOG");
        persona.setEmail("hess.bernard@omnigog.tv");
        persona.setPhone("+1 (831) 454-2316");
        persona.setAddress("805 Coyle Street, Fowlerville, Minnesota, 5948");
        persona.setLatitude("-78.236001");
        persona.setLongitude("148.655581");
        persona.setFavoriteFruit("banana");
        
        Account account = new Account();
        account.setUserId("parks");
        account.setUsername("parks");
        
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        
        persona.setAccounts(accounts);
        
        List<String> interests = new ArrayList<>();
        interests.add("DevOps");
        interests.add("Java");
        
        persona.setInterests(interests);
        
        return persona;
    }
}
