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
@Table(name = "devicetechnoloy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devicetechnoloy.findAll", query = "SELECT d FROM Devicetechnoloy d")
    , @NamedQuery(name = "Devicetechnoloy.findByProductsId", query = "SELECT d FROM Devicetechnoloy d WHERE d.productsId = :productsId")
    , @NamedQuery(name = "Devicetechnoloy.findByTypeDTId", query = "SELECT d FROM Devicetechnoloy d WHERE d.typeDTId = :typeDTId")
    , @NamedQuery(name = "Devicetechnoloy.findByImei", query = "SELECT d FROM Devicetechnoloy d WHERE d.imei = :imei")
    , @NamedQuery(name = "Devicetechnoloy.findByWarranty", query = "SELECT d FROM Devicetechnoloy d WHERE d.warranty = :warranty")
    , @NamedQuery(name = "Devicetechnoloy.findByOs", query = "SELECT d FROM Devicetechnoloy d WHERE d.os = :os")
    , @NamedQuery(name = "Devicetechnoloy.findByProcessor", query = "SELECT d FROM Devicetechnoloy d WHERE d.processor = :processor")
    , @NamedQuery(name = "Devicetechnoloy.findByHardDrive", query = "SELECT d FROM Devicetechnoloy d WHERE d.hardDrive = :hardDrive")
    , @NamedQuery(name = "Devicetechnoloy.findByRom", query = "SELECT d FROM Devicetechnoloy d WHERE d.rom = :rom")
    , @NamedQuery(name = "Devicetechnoloy.findByRam", query = "SELECT d FROM Devicetechnoloy d WHERE d.ram = :ram")})
public class Devicetechnoloy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Column(name = "TypeDTId")
    private Integer typeDTId;
    @Size(max = 255)
    @Column(name = "Imei")
    private String imei;
    @Size(max = 255)
    @Column(name = "Warranty")
    private String warranty;
    @Size(max = 255)
    @Column(name = "Os")
    private String os;
    @Size(max = 255)
    @Column(name = "Processor")
    private String processor;
    @Size(max = 255)
    @Column(name = "HardDrive")
    private String hardDrive;
    @Column(name = "Rom")
    private Integer rom;
    @Column(name = "Ram")
    private Integer ram;

    public Devicetechnoloy() {
    }

    public Devicetechnoloy(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getTypeDTId() {
        return typeDTId;
    }

    public void setTypeDTId(Integer typeDTId) {
        this.typeDTId = typeDTId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productsId != null ? productsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devicetechnoloy)) {
            return false;
        }
        Devicetechnoloy other = (Devicetechnoloy) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Devicetechnoloy[ productsId=" + productsId + " ]";
    }
    
}
