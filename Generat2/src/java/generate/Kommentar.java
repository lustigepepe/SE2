package generate;


import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Kommentar extends Beitrag implements Serializable {

     @ManyToOne
    private Beitrag myBeitrag;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.myBeitrag);
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
        final Kommentar other = (Kommentar) obj;
        return Objects.equals(this.myBeitrag, other.myBeitrag);
    }

 

    
    
    public Beitrag getMyBeitrag() {
        return myBeitrag;
    }

    public void setMyBeitrag(Beitrag myBeitrag) {
        this.myBeitrag = myBeitrag;
    }

}
