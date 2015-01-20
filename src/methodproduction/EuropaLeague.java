
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;

// ---------------------------------------------------------------
//			EuropaLeague
// ---------------------------------------------------------------

public class EuropaLeague extends Europe {

    public EuropaLeague() {
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
        String resultat = "Europa League\n"+ligne + "\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+equipes.get(0).getNomEquipe()+"\n";
        return resultat;
    }
}
