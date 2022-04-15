package main;

import model.*;

import javax.persistence.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager em = emf.createEntityManager();

        Indirizzo i = new Indirizzo();
        i.setVia("Via Roma");
        i.setComune("Roma");
        i.setProvincia("RM");
        i.setNumeroCivico(12);
        i.setCap(90210);

        Azienda az = new Azienda();
        az.setNome("Accenture");
        az.setNumeroTelefono("06060606");
        az.setRagioneSociale("Societa");
        az.setIndirizzo(i);

        Allievo a1 = new Allievo();
        a1.setNome("Mario");
        a1.setCognome("Verdi");
        a1.setEmail("marioverdi@gmail.com");
        a1.setDataNascita(new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime());
        a1.setAzienda(az);
        a1.setLuogoNascita("Roma");
        a1.setMatricola(2314);

        Allievo a2 = new Allievo();
        a2.setNome("Mario");
        a2.setCognome("Rossi");
        a2.setEmail("mariorossi@gmail.com");
        a2.setDataNascita(new GregorianCalendar(1992, Calendar.MARCH, 11).getTime());
        a2.setAzienda(az);
        a2.setLuogoNascita("Milano");
        a2.setMatricola(213);

        Docente d = new Docente();
        d.setNome("Paolo");
        d.setCognome("Merialdo");
        d.setLuogoNascita("Roma");
        d.setPartitaIva(21240159);
        d.setDataNascita(new GregorianCalendar(1970, Calendar.SEPTEMBER, 11).getTime());

        Corso c = new Corso();
        c.setNome("SIW");
        c.setDocente(d);
        c.setDurataInMesi(3);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(i);
        em.persist(az);
        em.persist(a1);
        em.persist(a2);
        em.persist(d);
        em.persist(c);
        tx.commit();

        em.close();
        emf.close();
    }
}
