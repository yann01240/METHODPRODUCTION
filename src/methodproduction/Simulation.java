
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;

// ---------------------------------------------------------------
//			Classe Simulation
// ---------------------------------------------------------------

public interface Simulation {
    
    public void simulation ();
    
    public ArrayList<Equipe> selectionEuropa();
    public ArrayList<Equipe> selectionChampions();
    public String classement();
      
    
}
