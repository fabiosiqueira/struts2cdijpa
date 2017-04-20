package br.com.fsa.model.struts2cdijpa.entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Fabio
 */
@Entity
@Table(name = "TabelaTeste1", catalog = "", schema = "MODEL")
@NamedQueries({
    @NamedQuery(name = "TabelaTeste1.findAll", query = "SELECT t FROM TabelaTeste1 t")})
public class TabelaTeste1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;

    public TabelaTeste1() {
    }

    public TabelaTeste1(Integer id) {
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
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
        if (!(object instanceof TabelaTeste1)) {
            return false;
        }
        TabelaTeste1 other = (TabelaTeste1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fsa.model.struts2cdijpa.entity.TabelaTeste1[ id=" + id + " ]";
    }

}
