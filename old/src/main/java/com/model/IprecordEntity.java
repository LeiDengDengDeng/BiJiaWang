package com.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by starrylemon on 2017/4/13.
 */
@Entity
@Table(name = "iprecord", schema = "biJiangWang", catalog = "")
public class IprecordEntity {
    private String idaddress;
    private Integer times;
    private Integer totaltimes;
    private Timestamp lastvisittime;

    @Id
    @Column(name = "idaddress", nullable = false, length = 45)
    public String getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(String idaddress) {
        this.idaddress = idaddress;
    }

    @Basic
    @Column(name = "times", nullable = true)
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Basic
    @Column(name = "totaltimes", nullable = true)
    public Integer getTotaltimes() {
        return totaltimes;
    }

    public void setTotaltimes(Integer totaltimes) {
        this.totaltimes = totaltimes;
    }

    @Basic
    @Column(name = "lastvisittime", nullable = true)
    public Timestamp getLastvisittime() {
        return lastvisittime;
    }

    public void setLastvisittime(Timestamp lastvisittime) {
        this.lastvisittime = lastvisittime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IprecordEntity that = (IprecordEntity) o;

        if (idaddress != null ? !idaddress.equals(that.idaddress) : that.idaddress != null) return false;
        if (times != null ? !times.equals(that.times) : that.times != null) return false;
        if (totaltimes != null ? !totaltimes.equals(that.totaltimes) : that.totaltimes != null) return false;
        if (lastvisittime != null ? !lastvisittime.equals(that.lastvisittime) : that.lastvisittime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idaddress != null ? idaddress.hashCode() : 0;
        result = 31 * result + (times != null ? times.hashCode() : 0);
        result = 31 * result + (totaltimes != null ? totaltimes.hashCode() : 0);
        result = 31 * result + (lastvisittime != null ? lastvisittime.hashCode() : 0);
        return result;
    }
}
