package generate;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import static org.omg.CORBA.AnySeqHelper.id;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Beitrag implements Serializable {


    @Id
    private Integer id;
    @OneToMany
    private Collection<Bild> myBild;
    @OneToMany
    private Collection<Kommentar> myKommentar;
  

    
    @ManyToMany(mappedBy = "myBeitrag")
    private Collection<Mitarbeiter> myMitarbeiter;
    
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datum;

    private int bewertung;

    private String titel;

    private String beschreibung;

   

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Beitrag other = (Beitrag) obj;
        return Objects.equals(this.id, other.id);
    }

    
    
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Bild> getMyBild() {
        return myBild;
    }

    public void setMyBild(Collection<Bild> myBild) {
        this.myBild = myBild;
    }

    public Collection<Kommentar> getMyKommentar() {
        return myKommentar;
    }

    public void setMyKommentar(Collection<Kommentar> myKommentar) {
        this.myKommentar = myKommentar;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public Collection<Mitarbeiter> getMyMitarbeiter() {
        return myMitarbeiter;
    }

    public void setMyMitarbeiter(Collection<Mitarbeiter> myMitarbeiter) {
        this.myMitarbeiter = myMitarbeiter;
    }

  


  
    

}
