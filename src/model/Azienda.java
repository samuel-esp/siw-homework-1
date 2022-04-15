package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String ragioneSociale;

    //Fetch Type Eager perche l'indirizzo lo voglio subito, Persist e Remove per Cascade type perche abbiamo una composizione
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Indirizzo indirizzo;

    private String numeroTelefono;

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

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
        return Objects.equals(id, azienda.id) && Objects.equals(nome, azienda.nome) && Objects.equals(ragioneSociale, azienda.ragioneSociale) && Objects.equals(numeroTelefono, azienda.numeroTelefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ragioneSociale, numeroTelefono);
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
}
