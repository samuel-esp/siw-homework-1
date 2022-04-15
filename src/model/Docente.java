package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cognome;

    private Date dataNascita;

    private String luogoNascita;

    private Integer partitaIva;

    @OneToMany(mappedBy = "docente")
    private List<Corso> corso;

    public Docente() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docente docente = (Docente) o;
        return Objects.equals(id, docente.id) && Objects.equals(nome, docente.nome) && Objects.equals(cognome, docente.cognome) && Objects.equals(dataNascita, docente.dataNascita) && Objects.equals(luogoNascita, docente.luogoNascita) && Objects.equals(partitaIva, docente.partitaIva) && Objects.equals(corso, docente.corso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, dataNascita, luogoNascita, partitaIva, corso);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public Integer getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(Integer partitaIva) {
        this.partitaIva = partitaIva;
    }

    public List<Corso> getCorso() {
        return corso;
    }

    public void setCorso(List<Corso> corso) {
        this.corso = corso;
    }
}
