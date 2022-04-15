package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Indirizzo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String via;

    private Integer numeroCivico;

    private String comune;

    private Integer cap;

    private String provincia;

    public Indirizzo(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indirizzo indirizzo = (Indirizzo) o;
        return Objects.equals(id, indirizzo.id) && Objects.equals(via, indirizzo.via) && Objects.equals(numeroCivico, indirizzo.numeroCivico) && Objects.equals(comune, indirizzo.comune) && Objects.equals(cap, indirizzo.cap) && Objects.equals(provincia, indirizzo.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, via, numeroCivico, comune, cap, provincia);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public Integer getNumeroCivico() {
        return numeroCivico;
    }

    public void setNumeroCivico(Integer numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
