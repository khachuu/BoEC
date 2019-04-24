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
@Table(name = "book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
    , @NamedQuery(name = "Book.findByProductsId", query = "SELECT b FROM Book b WHERE b.productsId = :productsId")
    , @NamedQuery(name = "Book.findByTypeBookID", query = "SELECT b FROM Book b WHERE b.typeBookID = :typeBookID")
    , @NamedQuery(name = "Book.findByAuthorID", query = "SELECT b FROM Book b WHERE b.authorID = :authorID")
    , @NamedQuery(name = "Book.findByPushlishYear", query = "SELECT b FROM Book b WHERE b.pushlishYear = :pushlishYear")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductsId")
    private Integer productsId;
    @Column(name = "TypeBookID")
    private Integer typeBookID;
    @Column(name = "AuthorID")
    private Integer authorID;
    @Column(name = "PushlishYear")
    private Integer pushlishYear;

    public Book() {
    }

    public Book(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getTypeBookID() {
        return typeBookID;
    }

    public void setTypeBookID(Integer typeBookID) {
        this.typeBookID = typeBookID;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public Integer getPushlishYear() {
        return pushlishYear;
    }

    public void setPushlishYear(Integer pushlishYear) {
        this.pushlishYear = pushlishYear;
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
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Book[ productsId=" + productsId + " ]";
    }
    
}
