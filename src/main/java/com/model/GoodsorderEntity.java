package com.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by luoxuechun on 2017/3/26.
 */
@Entity
@Table(name = "goodsorder", schema = "biJiangWang", catalog = "")
public class GoodsorderEntity {
    private int orderId;
    private String price;
    private String amount;
    private Timestamp buytime;
    private UserEntity userByUserId;
    private GoodEntity goodByGoodId;

    @Id
    @Column(name = "orderID")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "buytime")
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

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "goodID", referencedColumnName = "goodID", nullable = false)
    public GoodEntity getGoodByGoodId() {
        return goodByGoodId;
    }

    public void setGoodByGoodId(GoodEntity goodByGoodId) {
        this.goodByGoodId = goodByGoodId;
    }
}
