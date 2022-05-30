package com.examen.webapitest.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy ="user" , targetEntity = Phone.class,fetch=FetchType.LAZY )
    private List<Phone> phones;

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public List<Phone> getPhones () {
        return phones;
    }

    public void setPhones (List<Phone> phoneList) {
        this.phones = phoneList;
    }
}