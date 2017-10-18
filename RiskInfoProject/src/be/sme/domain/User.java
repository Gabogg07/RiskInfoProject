package be.sme.domain;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private Date lastLogin;
    private Profile profile;

    public User(String username, String password, Date lastLogin, Profile profile) {
        this.username = username;
        this.password = password;
        this.lastLogin = lastLogin;
        this.profile = profile;
    }
}
