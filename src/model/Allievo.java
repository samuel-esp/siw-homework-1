package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Allievo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cognome;

    private Date dataNascita;

    private String luogoNascita;

    private Integer matricola;

    private String email;

    //Fetch Type Eager, l'azienda la voglio subito, Cascade Persist e Remove dato che azienda fa parte della composizione
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn
    private Azienda azienda;

    @ManyToMany
    private List<Corso> corso;

    public Allievo(){

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

    public Integer getMatricola() {
        return matricola;
    }

    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public List<Corso> getCorso() {
        return corso;
    }

    public void setCorso(List<Corso> corso) {
        this.corso = corso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allievo allievo = (Allievo) o;
        return Objects.equals(id, allievo.id) && Objects.equals(nome, allievo.nome) && Objects.equals(cognome, allievo.cognome) && Objects.equals(dataNascita, allievo.dataNascita) && Objects.equals(luogoNascita, allievo.luogoNascita) && Objects.equals(matricola, allievo.matricola) && Objects.equals(email, allievo.email) && Objects.equals(azienda, allievo.azienda) && Objects.equals(corso, allievo.corso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, dataNascita, luogoNascita, matricola, email, azienda, corso);
    }
}
