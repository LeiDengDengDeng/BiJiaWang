package com.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by starrylemon on 2017/4/13.
 */
@Entity
@Table(name = "goodsorder", schema = "biJiangWang", catalog = "")
public class GoodsorderEntity {
    private int orderId;
    private String price;
    private String amount;
    private Timestamp buytime;

    @Id
    @Column(name = "orderID", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "price", nullable = false, length = 45)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "amount", nullable = false, length = 45)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "buytime", nullable = true)
    public Timestamp getBuytime() {
        return buytime;
    }

    public void setBuytime(Timestamp buytime) {
        this.buytime = buytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsorderEntity that = (GoodsorderEntity) o;

        if (orderId != that.orderId) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (buytime != null ? !buytime.equals(that.buytime) : that.buytime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (buytime != null ? buytime.hashCode() : 0);
        return result;
    }
}
