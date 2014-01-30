package generate;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Bild implements Serializable {

    @Id
    private Integer id;

    /**
     *
     */
    private String typ;
    @ManyToOne
    Beitrag myBeitrag;
    
    /**
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datum;

    private int laenge;

    private int breite;

    private String titel;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Bild other = (Bild) obj;
        return Objects.equals(this.id, other.id);
    }


    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    
    public Beitrag getMyBeitrag() {
        return myBeitrag;
    }

    public void setMyBeitrag(Beitrag myBeitrag) {
        this.myBeitrag = myBeitrag;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

}
