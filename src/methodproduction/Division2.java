
package methodproduction;

import packModele.Requetes;

// ---------------------------------------------------------------
//			Division 2
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public class Division2 extends Championnat {

    /**
     *
     * @param pays
     */
    public Division2(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays,2),pays);
    }

}
