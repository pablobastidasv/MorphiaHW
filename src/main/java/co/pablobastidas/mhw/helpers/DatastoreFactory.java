package co.pablobastidas.mhw.helpers;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class DatastoreFactory {
    
    private DatastoreFactory(){
        
    }
    
    public static Datastore create(){
        final Morphia morphia = new Morphia();
        morphia.mapPackage("co.pablobastidas.mhw.model");
        
        final MongoClient mongo = MyMongoClient.getInstance();
        
        final String db = "myDb";

        final Datastore ds = morphia.createDatastore(mongo, db);
        ds.ensureIndexes();

        return ds;
    }
}
