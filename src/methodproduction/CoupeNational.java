
package methodproduction;

import packModele.Requetes;

// ---------------------------------------------------------------
//			Coupe National
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public class CoupeNational extends Coupe {

    /**
     *
     * @param pays
     */
    public CoupeNational(String pays) {
        super(Requetes.getCoupeNationalEquipe(pays),pays);
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
        String resultat = "Coupe National de "+pays+"\n"+ligne + "\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+vainqueur.getNomEquipe()+"\n";
        return resultat;
    }
    
}
