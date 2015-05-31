package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by @Ksimeo on 31.05.2015
 */
@Entity(name = "goodsnames")
public class GoodsName {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private List<Goods> goods;

    public GoodsName() { }

    public GoodsName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
