package com.examen.webapitest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @JsonIgnore
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private User user;

    private String number;
    private String citycode;
    private String countryCode;



    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getCitycode () {
        return citycode;
    }

    public void setCitycode (String citycode) {
        this.citycode = citycode;
    }

    public String getCountryCode () {
        return countryCode;
    }

    public void setCountryCode (String countryCode) {
        this.countryCode = countryCode;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}
