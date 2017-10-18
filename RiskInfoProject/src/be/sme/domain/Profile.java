package be.sme.domain;

import java.util.Date;

public class Profile {
    private String name;
    private String surname;
    private String email;
    private Date dateTime;

    public Profile(String name, String surname, String email, Date dateTime) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateTime = dateTime;
    }
}
