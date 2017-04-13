package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Entity
@Table(name = "ipblacklist", schema = "biJiangWang", catalog = "")
public class IpblacklistEntity {
    private String ipaddress;

    @Id
    @Column(name = "ipaddress", nullable = false, length = 45)
    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpblacklistEntity that = (IpblacklistEntity) o;

        return ipaddress != null ? ipaddress.equals(that.ipaddress) : that.ipaddress == null;

    }

    @Override
    public int hashCode() {
        return ipaddress != null ? ipaddress.hashCode() : 0;
    }
}
