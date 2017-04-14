package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by starrylemon on 2017/4/13.
 */
@Entity
@Table(name = "goodshield", schema = "biJiangWang", catalog = "")
public class GoodshieldEntity {
    private int goodId;

    @Id
    @Column(name = "goodID", nullable = false)
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
}
