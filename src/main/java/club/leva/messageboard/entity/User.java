package club.leva.messageboard.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {

    @Id
    private int id;

    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
