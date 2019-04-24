/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByFullNameID", query = "SELECT e FROM Employee e WHERE e.fullNameID = :fullNameID")
    , @NamedQuery(name = "Employee.findByAccountUsername", query = "SELECT e FROM Employee e WHERE e.accountUsername = :accountUsername")
    , @NamedQuery(name = "Employee.findBySalaryId", query = "SELECT e FROM Employee e WHERE e.salaryId = :salaryId")
    , @NamedQuery(name = "Employee.findByDepatrmentId", query = "SELECT e FROM Employee e WHERE e.depatrmentId = :depatrmentId")
    , @NamedQuery(name = "Employee.findByRoles", query = "SELECT e FROM Employee e WHERE e.roles = :roles")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FullNameID")
    private int fullNameID;
    @Size(max = 255)
    @Column(name = "AccountUsername")
    private String accountUsername;
    @Column(name = "SalaryId")
    private Integer salaryId;
    @Column(name = "DepatrmentId")
    private Integer depatrmentId;
    @Size(max = 255)
    @Column(name = "roles")
    private String roles;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Onlinesaleempl onlinesaleempl;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Shopkeeper shopkeeper;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Storageempl storageempl;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Manager manager;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, int fullNameID) {
        this.id = id;
        this.fullNameID = fullNameID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFullNameID() {
        return fullNameID;
    }

    public void setFullNameID(int fullNameID) {
        this.fullNameID = fullNameID;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getDepatrmentId() {
        return depatrmentId;
    }

    public void setDepatrmentId(Integer depatrmentId) {
        this.depatrmentId = depatrmentId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Onlinesaleempl getOnlinesaleempl() {
        return onlinesaleempl;
    }

    public void setOnlinesaleempl(Onlinesaleempl onlinesaleempl) {
        this.onlinesaleempl = onlinesaleempl;
    }

    public Shopkeeper getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(Shopkeeper shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    public Storageempl getStorageempl() {
        return storageempl;
    }

    public void setStorageempl(Storageempl storageempl) {
        this.storageempl = storageempl;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Employee[ id=" + id + " ]";
    }
    
}
