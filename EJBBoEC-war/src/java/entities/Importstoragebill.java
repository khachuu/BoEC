/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "importstoragebill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Importstoragebill.findAll", query = "SELECT i FROM Importstoragebill i")
    , @NamedQuery(name = "Importstoragebill.findById", query = "SELECT i FROM Importstoragebill i WHERE i.id = :id")
    , @NamedQuery(name = "Importstoragebill.findByStorageId", query = "SELECT i FROM Importstoragebill i WHERE i.storageId = :storageId")
    , @NamedQuery(name = "Importstoragebill.findByTime", query = "SELECT i FROM Importstoragebill i WHERE i.time = :time")
    , @NamedQuery(name = "Importstoragebill.findByTotalMoney", query = "SELECT i FROM Importstoragebill i WHERE i.totalMoney = :totalMoney")})
public class Importstoragebill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "StorageId")
    private Integer storageId;
    @Size(max = 255)
    @Column(name = "Time")
    private String time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalMoney")
    private double totalMoney;

    public Importstoragebill() {
    }

    public Importstoragebill(Integer id) {
        this.id = id;
    }

    public Importstoragebill(Integer id, double totalMoney) {
        this.id = id;
        this.totalMoney = totalMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Importstoragebill)) {
            return false;
        }
        Importstoragebill other = (Importstoragebill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Importstoragebill[ id=" + id + " ]";
    }
    
}
