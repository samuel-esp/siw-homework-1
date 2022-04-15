package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Date dataInizio;

    private Integer durataInMesi;

    @ManyToOne
    private Docente docente;

    @ManyToMany(mappedBy = "corso")
    private List<Allievo> allievoList;

    public Corso(){

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

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Integer getDurataInMesi() {
        return durataInMesi;
    }

    public void setDurataInMesi(Integer durataInMesi) {
        this.durataInMesi = durataInMesi;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Allievo> getAllievoList() {
        return allievoList;
    }

    public void setAllievoList(List<Allievo> allievoList) {
        this.allievoList = allievoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corso corso = (Corso) o;
        return Objects.equals(id, corso.id) && Objects.equals(nome, corso.nome) && Objects.equals(dataInizio, corso.dataInizio) && Objects.equals(durataInMesi, corso.durataInMesi) && Objects.equals(docente, corso.docente) && Objects.equals(allievoList, corso.allievoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataInizio, durataInMesi, docente, allievoList);
    }
}
