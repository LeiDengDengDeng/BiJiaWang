package model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Entity
@Table(name = "good", schema = "biJiangWang", catalog = "")
public class GoodEntity {
    private int goodId;
    private String name;
    private String url;
    private String pictureSrc;
    private String detail;
    private String price;
    private Integer commentCount;
    private Double goodRate;
    private Date date;
    private Collection<CommentEntity> commentsByGoodId;
    private Collection<CommentEntity> commentsByGoodId_0;
    private GoodshieldEntity goodshieldByGoodId;
    private Collection<GoodsorderEntity> goodsordersByGoodId;
    private Collection<GoodsorderEntity> goodsordersByGoodId_0;

    @Id
    @Column(name = "goodID", nullable = false)
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 64)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "pictureSrc", nullable = true, length = 64)
    public String getPictureSrc() {
        return pictureSrc;
    }

    public void setPictureSrc(String pictureSrc) {
        this.pictureSrc = pictureSrc;
    }

    @Basic
    @Column(name = "detail", nullable = true, length = 64)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "price", nullable = true, length = 64)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "commentCount", nullable = true)
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Basic
    @Column(name = "goodRate", nullable = true, precision = 0)
    public Double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(Double goodRate) {
        this.goodRate = goodRate;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodEntity that = (GoodEntity) o;

        if (goodId != that.goodId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (pictureSrc != null ? !pictureSrc.equals(that.pictureSrc) : that.pictureSrc != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;
        if (goodRate != null ? !goodRate.equals(that.goodRate) : that.goodRate != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;

    }

    @Override
    public int hashCode() {
        int result = goodId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (pictureSrc != null ? pictureSrc.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (goodRate != null ? goodRate.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "goodByGoodId")
    public Collection<CommentEntity> getCommentsByGoodId() {
        return commentsByGoodId;
    }

    public void setCommentsByGoodId(Collection<CommentEntity> commentsByGoodId) {
        this.commentsByGoodId = commentsByGoodId;
    }

    @OneToMany(mappedBy = "goodByGoodId_0")
    public Collection<CommentEntity> getCommentsByGoodId_0() {
        return commentsByGoodId_0;
    }

    public void setCommentsByGoodId_0(Collection<CommentEntity> commentsByGoodId_0) {
        this.commentsByGoodId_0 = commentsByGoodId_0;
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

    @OneToMany(mappedBy = "goodByGoodId_0")
    public Collection<GoodsorderEntity> getGoodsordersByGoodId_0() {
        return goodsordersByGoodId_0;
    }

    public void setGoodsordersByGoodId_0(Collection<GoodsorderEntity> goodsordersByGoodId_0) {
        this.goodsordersByGoodId_0 = goodsordersByGoodId_0;
    }
}
