package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;


// ---------------------------------------------------------------
//			Classe mère des deux coupes Européennes
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */

public abstract class Europe extends Competition {

    /**
     *
     * @param equipes
     */
    public Europe(ArrayList<Equipe> equipes) {
        super(equipes,null);
    }

}
