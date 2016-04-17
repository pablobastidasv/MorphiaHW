package co.pablobastidas.mhw.helpers;

import com.mongodb.MongoClient;

public class MyMongoClient {
    private static MongoClient mongo;
    
    private MyMongoClient(){
    }
    
    public static synchronized MongoClient getInstance(){
        if(mongo == null){
            mongo = crearCliente();
        }
        return mongo;
    }

    private static MongoClient crearCliente() {
        return new MongoClient("docker.me", 27017);
    }
    
}
