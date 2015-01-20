
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;


// ---------------------------------------------------------------
//			La Ligue des Champions
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */

public class ChampionsLeague extends Europe {

    /**
     * Ligues des Champions
     */
    public ChampionsLeague() {
        super(new ArrayList<Equipe>());
    }
    
    @Override
    public String toString() {
        int max = 0;
        for (String score : scores) {
            if (score.length()>max){
                max=score.length();
            }
        }
        String ligne = "";
        for (int i = 0; i < max+2; i++) {
                ligne+="=";
            }
        String resultat = "Champions League\n"+ligne + "\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+equipes.get(0).getNomEquipe()+"\n";
        return resultat;
    }
    
}
