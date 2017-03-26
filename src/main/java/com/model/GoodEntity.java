package com.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by luoxuechun on 2017/3/26.
 */
@Entity
@Table(name = "good", schema = "biJiangWang", catalog = "")
public class GoodEntity {
    private int goodId;
    private String goodName;
    private double goodPrice;
    private String goodStoreName;
    private String goodStoreHref;
    private String type;
    private String brand;
    private String description;
    private Collection<CommentEntity> commentsByGoodId;
    private GoodshieldEntity goodshieldByGoodId;
    private Collection<GoodsorderEntity> goodsordersByGoodId;

    @Id
    @Column(name = "goodID")
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Basic
    @Column(name = "goodName")
    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    @Basic
    @Column(name = "goodPrice")
    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    @Basic
    @Column(name = "goodStoreName")
    public String getGoodStoreName() {
        return goodStoreName;
    }

    public void setGoodStoreName(String goodStoreName) {
        this.goodStoreName = goodStoreName;
    }

    @Basic
    @Column(name = "goodStoreHref")
    public String getGoodStoreHref() {
        return goodStoreHref;
    }

    public void setGoodStoreHref(String goodStoreHref) {
        this.goodStoreHref = goodStoreHref;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodEntity that = (GoodEntity) o;

        if (goodId != that.goodId) return false;
        if (Double.compare(that.goodPrice, goodPrice) != 0) return false;
        if (goodName != null ? !goodName.equals(that.goodName) : that.goodName != null) return false;
        if (goodStoreName != null ? !goodStoreName.equals(that.goodStoreName) : that.goodStoreName != null)
            return false;
        if (goodStoreHref != null ? !goodStoreHref.equals(that.goodStoreHref) : that.goodStoreHref != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = goodId;
        result = 31 * result + (goodName != null ? goodName.hashCode() : 0);
        temp = Double.doubleToLongBits(goodPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (goodStoreName != null ? goodStoreName.hashCode() : 0);
        result = 31 * result + (goodStoreHref != null ? goodStoreHref.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "goodByGoodId")
    public Collection<CommentEntity> getCommentsByGoodId() {
        return commentsByGoodId;
    }

    public void setCommentsByGoodId(Collection<CommentEntity> commentsByGoodId) {
        this.commentsByGoodId = commentsByGoodId;
    }

    @OneToOne(mappedBy = "goodByGoodId")
    public GoodshieldEntity getGoodshieldByGoodId() {
        return goodshieldByGoodId;
    }

    public void setGoodshieldByGoodId(GoodshieldEntity goodshieldByGoodId) {
        this.goodshieldByGoodId = goodshieldByGoodId;
    }

    @OneToMany(mappedBy = "goodByGoodId")
    public Collection<GoodsorderEntity> getGoodsordersByGoodId() {
        return goodsordersByGoodId;
    }

    public void setGoodsordersByGoodId(Collection<GoodsorderEntity> goodsordersByGoodId) {
        this.goodsordersByGoodId = goodsordersByGoodId;
    }
}
