package br.com.fsa.model.struts2cdijpa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Fabio
 */
@Entity
@Table(name = "TabelaTeste2", catalog = "", schema = "MODEL")
@NamedQueries({
    @NamedQuery(name = "TabelaTeste2.findAll", query = "SELECT t FROM TabelaTeste2 t")})
public class TabelaTeste2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOME")
    private String nome;

    public TabelaTeste2() {
    }

    public TabelaTeste2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof TabelaTeste2)) {
            return false;
        }
        TabelaTeste2 other = (TabelaTeste2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fsa.model.struts2cdijpa.entity.TabelaTeste2[ id=" + id + " ]";
    }

}
