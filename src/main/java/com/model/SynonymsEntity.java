package com.model;

import javax.persistence.*;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Entity
@Table(name = "synonyms", schema = "biJiangWang", catalog = "")
public class SynonymsEntity {
    private int id;
    private String synonymsWord;
    private String word;

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
    @Column(name = "word", nullable = false, length = 255)
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SynonymsEntity that = (SynonymsEntity) o;

        if (id != that.id) return false;
        if (synonymsWord != null ? !synonymsWord.equals(that.synonymsWord) : that.synonymsWord != null) return false;
        if (word != null ? !word.equals(that.word) : that.word != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (synonymsWord != null ? synonymsWord.hashCode() : 0);
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }
}
