
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;

// ---------------------------------------------------------------
//		La classe mère des Coupes 
// ---------------------------------------------------------------

public abstract class Coupe extends National {

    public Coupe(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
    }

}
