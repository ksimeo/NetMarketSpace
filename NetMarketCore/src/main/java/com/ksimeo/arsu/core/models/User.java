package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by @Ksimeo on 31.05.2015
 */
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String login;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String isAdmin;

    public User() {
    }

    public User(String login, String name, String password, String isAdmin) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
