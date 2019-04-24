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
@Table(name = "department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
    , @NamedQuery(name = "Department.findByIdDepatrment", query = "SELECT d FROM Department d WHERE d.idDepatrment = :idDepatrment")
    , @NamedQuery(name = "Department.findByNameDepartment", query = "SELECT d FROM Department d WHERE d.nameDepartment = :nameDepartment")})
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdDepatrment")
    private Integer idDepatrment;
    @Size(max = 255)
    @Column(name = "NameDepartment")
    private String nameDepartment;

    public Department() {
    }

    public Department(Integer idDepatrment) {
        this.idDepatrment = idDepatrment;
    }

    public Integer getIdDepatrment() {
        return idDepatrment;
    }

    public void setIdDepatrment(Integer idDepatrment) {
        this.idDepatrment = idDepatrment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepatrment != null ? idDepatrment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.idDepatrment == null && other.idDepatrment != null) || (this.idDepatrment != null && !this.idDepatrment.equals(other.idDepatrment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Department[ idDepatrment=" + idDepatrment + " ]";
    }
    
}
