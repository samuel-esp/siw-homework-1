package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
