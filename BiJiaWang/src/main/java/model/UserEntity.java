package model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by luoxuechun on 2017/4/13.
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
    private Collection<CommentEntity> commentsByUserId_0;
    private Collection<GoodsorderEntity> goodsordersByUserId;
    private Collection<GoodsorderEntity> goodsordersByUserId_0;

    @Id
    @Column(name = "userID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 50)
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
        return phone != null ? phone.equals(that.phone) : that.phone == null;

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

    @OneToMany(mappedBy = "userByUserId_0")
    public Collection<CommentEntity> getCommentsByUserId_0() {
        return commentsByUserId_0;
    }

    public void setCommentsByUserId_0(Collection<CommentEntity> commentsByUserId_0) {
        this.commentsByUserId_0 = commentsByUserId_0;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<GoodsorderEntity> getGoodsordersByUserId() {
        return goodsordersByUserId;
    }

    public void setGoodsordersByUserId(Collection<GoodsorderEntity> goodsordersByUserId) {
        this.goodsordersByUserId = goodsordersByUserId;
    }

    @OneToMany(mappedBy = "userByUserId_0")
    public Collection<GoodsorderEntity> getGoodsordersByUserId_0() {
        return goodsordersByUserId_0;
    }

    public void setGoodsordersByUserId_0(Collection<GoodsorderEntity> goodsordersByUserId_0) {
        this.goodsordersByUserId_0 = goodsordersByUserId_0;
    }
}
