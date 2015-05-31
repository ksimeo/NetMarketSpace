package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by @Ksimeo on 31.05.2015
 */
@Entity(name = "goodsgroups")
public class GoodsGroup {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column(name = "goodsnames")
    private List<GoodsName> goodsNames;

    public GoodsGroup() { }

    public GoodsGroup(String name, List<GoodsName> goodsNames) {
        this.name = name;
        this.goodsNames = goodsNames;
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

    public List<GoodsName> getGoodsNames() {
        return goodsNames;
    }

    public void setGoodsNames(List<GoodsName> goodsNames) {
        this.goodsNames = goodsNames;
    }
}
