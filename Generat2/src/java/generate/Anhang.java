package generate;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Anhang implements Serializable {

    @Id
    private Integer id;
    private String URL;

    private String titel;
    
    @OneToMany
    private Collection<Idee> myIdee;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final Anhang other = (Anhang) obj;
        return Objects.equals(this.id, other.id);
    }

    

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Collection<Idee> getMyIdee() {
        return myIdee;
    }

    public void setMyIdee(Collection<Idee> myIdee) {
        this.myIdee = myIdee;
    }

   
}
