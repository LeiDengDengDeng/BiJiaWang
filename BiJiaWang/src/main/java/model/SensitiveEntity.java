package model;

import javax.persistence.*;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Entity
@Table(name = "sensitive", schema = "biJiangWang", catalog = "")
public class SensitiveEntity {
    private String sensitiveWord;
    private int id;

    @Basic
    @Column(name = "sensitiveWord", nullable = false, length = 255)
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SensitiveEntity that = (SensitiveEntity) o;

        if (id != that.id) return false;
        return sensitiveWord != null ? sensitiveWord.equals(that.sensitiveWord) : that.sensitiveWord == null;

    }

    @Override
    public int hashCode() {
        int result = sensitiveWord != null ? sensitiveWord.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
