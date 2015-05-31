package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by @Ksimeo on 31.05.2015
 */
@Entity
public class Goods {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="name")
    private GoodsName goodsType;
    @Column
    private String name;
    @Column(name = "description")
    private String descr;
    @Column
    private float price;
    @Column
    private CurrencyType type;

    public Goods() { }

    public Goods(GoodsName goodsType, String name, String descr, float price, CurrencyType type) {
        this.goodsType = goodsType;
        this.name = name;
        this.descr = descr;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GoodsName getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsName goodsType) {
        this.goodsType = goodsType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public CurrencyType getType() {
        return type;
    }

    public void setType(CurrencyType type) {
        this.type = type;
    }
}
