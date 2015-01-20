
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;

// ---------------------------------------------------------------
//			Classe Simulation
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public interface Simulation {
    
    /**
     *
     */
    public void simulation ();
    
    /**
     *
     * @return les 4,  5 et 6eme équipes de la division 1
     */
    public ArrayList<Equipe> selectionEuropa();

    /**
     *
     * @return les 1,  2 et 3eme équipes de la division 1
     */
    public ArrayList<Equipe> selectionChampions();

    /**
     *
     * @return le Classement
     */
    public String classement();
      
    
}
