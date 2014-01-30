package generate;


import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Mitarbeiter implements Serializable {

    @Id
    private Integer id;
    private String Name;

    private String Abteilung;

    private int Personalnr;

  

    @ManyToMany
    private Collection<Beitrag> myBeitrag;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Mitarbeiter other = (Mitarbeiter) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(String Abteilung) {
        this.Abteilung = Abteilung;
    }

    public int getPersonalnr() {
        return Personalnr;
    }

    public void setPersonalnr(int Personalnr) {
        this.Personalnr = Personalnr;
    }

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Beitrag> getMyBeitrag() {
        return myBeitrag;
    }

    public void setMyBeitrag(Collection<Beitrag> myBeitrag) {
        this.myBeitrag = myBeitrag;
    }

}
