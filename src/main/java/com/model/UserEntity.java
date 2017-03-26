package com.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by luoxuechun on 2017/3/26.
 */
@Entity
@Table(name = "user", schema = "biJiangWang", catalog = "")
public class UserEntity {
    private int userId;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private Collection<CommentEntity> commentsByUserId;
    private Collection<GoodsorderEntity> goodsordersByUserId;

    @Id
    @Column(name = "userID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<CommentEntity> getCommentsByUserId() {
        return commentsByUserId;
    }

    public void setCommentsByUserId(Collection<CommentEntity> commentsByUserId) {
        this.commentsByUserId = commentsByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<GoodsorderEntity> getGoodsordersByUserId() {
        return goodsordersByUserId;
    }

    public void setGoodsordersByUserId(Collection<GoodsorderEntity> goodsordersByUserId) {
        this.goodsordersByUserId = goodsordersByUserId;
    }
}
