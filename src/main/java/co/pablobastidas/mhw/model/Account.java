package co.pablobastidas.mhw.model;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Account {

    private String username;
    private String userId;

    public Account() {
    }

    public Account(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
