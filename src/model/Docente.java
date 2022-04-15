package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

}
