package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @OneToOne
    private Azienda azienda;

    @ManyToMany
    private List<Corso> corso;

}
