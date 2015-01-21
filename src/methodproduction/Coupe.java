
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;

// ---------------------------------------------------------------
//		La classe mère des Coupes 
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public abstract class Coupe extends National {

    /**
     *
     * @param equipes
     * @param pays
     */
    public Coupe(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
        
        if (this.equipes.size() % 2 != 0) {
            this.equipes.remove((int) (Math.random() * this.equipes.size()));
        }
    }

}
