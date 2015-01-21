
package methodproduction;

import packModele.Requetes;

// ---------------------------------------------------------------
//			Coupe de la Ligue
// ---------------------------------------------------------------


public class CoupeDeLaLigue extends Coupe {

    /**
     *
     * @param pays
     */
    public CoupeDeLaLigue(String pays) {
        super(Requetes.getCoupeLigueEquipe(pays),pays);
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
        String resultat = "Coupe de la Ligue de "+pays+"\n"+ligne + "\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+vainqueur.getNomEquipe()+"\n";
        return resultat;
    }
}
