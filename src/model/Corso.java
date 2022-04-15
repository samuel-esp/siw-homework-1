package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

}
