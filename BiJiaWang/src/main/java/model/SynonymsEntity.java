package model;

import javax.persistence.*;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Entity
@Table(name = "synonyms", schema = "biJiangWang", catalog = "")
public class SynonymsEntity {
    private int id;
    private String synonymsWord;
    private int groupid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "synonymsWord", nullable = false, length = 255)
    public String getSynonymsWord() {
        return synonymsWord;
    }

    public void setSynonymsWord(String synonymsWord) {
        this.synonymsWord = synonymsWord;
    }

    @Basic
    @Column(name = "groupid", nullable = false)
    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SynonymsEntity that = (SynonymsEntity) o;

        if (id != that.id) return false;
        if (groupid != that.groupid) return false;
        return synonymsWord != null ? synonymsWord.equals(that.synonymsWord) : that.synonymsWord == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (synonymsWord != null ? synonymsWord.hashCode() : 0);
        result = 31 * result + groupid;
        return result;
    }
}
