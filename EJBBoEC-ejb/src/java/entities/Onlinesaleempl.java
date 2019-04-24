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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "onlinesaleempl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Onlinesaleempl.findAll", query = "SELECT o FROM Onlinesaleempl o")
    , @NamedQuery(name = "Onlinesaleempl.findByEmployeeId", query = "SELECT o FROM Onlinesaleempl o WHERE o.employeeId = :employeeId")})
public class Onlinesaleempl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public Onlinesaleempl() {
    }

    public Onlinesaleempl(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onlinesaleempl)) {
            return false;
        }
        Onlinesaleempl other = (Onlinesaleempl) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Onlinesaleempl[ employeeId=" + employeeId + " ]";
    }
    
}
