/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Requetes;

/**
 *
 * @author yann01240
 */
public class CoupeNational extends Coupe {


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
        String resultat = "Coupe National de "+equipes.get(0).getNationEquipe()+"\n"+ligne + "\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+equipes.get(0).getNomEquipe()+"\n";
        return resultat;
    }
    
}
