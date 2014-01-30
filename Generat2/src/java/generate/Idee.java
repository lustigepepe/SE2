package generate;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Idee extends Beitrag {

  
    /**
     *
     * @element-type Anhang
     */
    @OneToMany
    private Collection<Anhang> myAnhang;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.myAnhang);
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
        final Idee other = (Idee) obj;
        return Objects.equals(this.myAnhang, other.myAnhang);
    }

 

    
    
    
    
    
    
    
    public Collection<Anhang> getMyAnhang() {
        return myAnhang;
    }

    public void setMyAnhang(Collection<Anhang> myAnhang) {
        this.myAnhang = myAnhang;
    }
    /**
     *
     * @element-type Anhang
     */

}
