package com.model;

import javax.persistence.*;

/**
 * Created by luoxuechun on 2017/3/26.
 */
@Entity
@Table(name = "goodshield", schema = "biJiangWang", catalog = "")
public class GoodshieldEntity {
    private int goodId;
    private GoodEntity goodByGoodId;

    @Id
    @Column(name = "goodID")
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodshieldEntity that = (GoodshieldEntity) o;

        if (goodId != that.goodId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return goodId;
    }

    @OneToOne
    @JoinColumn(name = "goodID", referencedColumnName = "goodID", nullable = false)
    public GoodEntity getGoodByGoodId() {
        return goodByGoodId;
    }

    public void setGoodByGoodId(GoodEntity goodByGoodId) {
        this.goodByGoodId = goodByGoodId;
    }
}
