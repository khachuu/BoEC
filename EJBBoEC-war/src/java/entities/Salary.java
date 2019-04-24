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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "salary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salary.findAll", query = "SELECT s FROM Salary s")
    , @NamedQuery(name = "Salary.findById", query = "SELECT s FROM Salary s WHERE s.id = :id")
    , @NamedQuery(name = "Salary.findByRateSalary", query = "SELECT s FROM Salary s WHERE s.rateSalary = :rateSalary")
    , @NamedQuery(name = "Salary.findByBonus", query = "SELECT s FROM Salary s WHERE s.bonus = :bonus")
    , @NamedQuery(name = "Salary.findByFines", query = "SELECT s FROM Salary s WHERE s.fines = :fines")})
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RateSalary")
    private double rateSalary;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bonus")
    private double bonus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fines")
    private double fines;

    public Salary() {
    }

    public Salary(Integer id) {
        this.id = id;
    }

    public Salary(Integer id, double rateSalary, double bonus, double fines) {
        this.id = id;
        this.rateSalary = rateSalary;
        this.bonus = bonus;
        this.fines = fines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getRateSalary() {
        return rateSalary;
    }

    public void setRateSalary(double rateSalary) {
        this.rateSalary = rateSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
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
        if (!(object instanceof Salary)) {
            return false;
        }
        Salary other = (Salary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Salary[ id=" + id + " ]";
    }
    
}
