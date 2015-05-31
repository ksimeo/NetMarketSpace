package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by @Ksimeo on 31.05.2015
 */
@Entity
public class Basket {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "creation_date")
    private Date creatDate;
    @Column
    private String tel;
    @Column
    private String email;

    public Basket() {
    }

    public Basket(Date creatDate, String tel, String email) {
        this.creatDate = creatDate;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
