
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;

// ---------------------------------------------------------------
//			Classe mère des competitions
// ---------------------------------------------------------------

public abstract class National extends Competition {
    
    public National(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
}
