
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;
import packModele.Requetes;

// ---------------------------------------------------------------
//			Division 1
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public class Division1 extends Championnat {
    
    /**
     *
     * @param pays
     */
    public Division1(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays, 1),pays);
    }

    /**
     *
     * @return les 4, 5 et 6eme équipes de la division 1 
     */
    @Override
    public ArrayList<Equipe> selectionEuropa() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(3));
        tmp.add(equipes.get(4));
        tmp.add(equipes.get(5));
        return tmp;
    }

    /**
     *
     * @return les 1, 2 et 3eme équipes de la division 1 
     */
    @Override
    public ArrayList<Equipe> selectionChampions() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(0));
        tmp.add(equipes.get(1));
        tmp.add(equipes.get(2));
        return tmp;
    }

}
