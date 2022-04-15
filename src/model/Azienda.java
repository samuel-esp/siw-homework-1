package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String ragioneSociale;

    private String via;

    private Integer numeroCivico;

    private String comune;

    private Integer cap;

    private String provincia;

    private String numeroTelefono;

    public Azienda(){

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

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Azienda azienda = (Azienda) o;
        return Objects.equals(id, azienda.id) && Objects.equals(nome, azienda.nome) && Objects.equals(ragioneSociale, azienda.ragioneSociale) && Objects.equals(via, azienda.via) && Objects.equals(numeroCivico, azienda.numeroCivico) && Objects.equals(comune, azienda.comune) && Objects.equals(cap, azienda.cap) && Objects.equals(provincia, azienda.provincia) && Objects.equals(numeroTelefono, azienda.numeroTelefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ragioneSociale, via, numeroCivico, comune, cap, provincia, numeroTelefono);
    }
}
