
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
    }

}
