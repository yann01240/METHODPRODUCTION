
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;

// ---------------------------------------------------------------
//			Classe mère des competitions
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public abstract class National extends Competition {
    
    /**
     *
     * @param equipes
     * @param pays
     */
    public National(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
    }

    /**
     *
     * @return la liste des pays
     */
    public String getPays() {
        return pays;
    }

    /**
     *
     * @param pays
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
    
}
