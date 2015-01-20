
package methodproduction;

import packModele.Requetes;

// ---------------------------------------------------------------
//			Division 2
// ---------------------------------------------------------------


public class Division2 extends Championnat {

    public Division2(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays,2),pays);
    }

}
