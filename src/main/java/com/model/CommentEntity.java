package com.model;

import javax.persistence.*;
import java.sql.Timestamp;
/**
 * Created by luoxuechun on 2017/3/26.
 */
@Entity
@Table(name = "comment", schema = "biJiangWang", catalog = "")
public class CommentEntity {
    private int commentId;
    private Timestamp time;
    private String content;
    private UserEntity userByUserId;
    private GoodEntity goodByGoodId;

    @Id
    @Column(name = "commentID")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (commentId != that.commentId) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
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
