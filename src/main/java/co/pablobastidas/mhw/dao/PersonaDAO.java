package co.pablobastidas.mhw.dao;

import co.pablobastidas.mhw.model.Persona;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

public class PersonaDAO extends BasicDAO<Persona, ObjectId> {
    
    public PersonaDAO(Datastore ds) {
        super(Persona.class, ds);
    }
    
}
