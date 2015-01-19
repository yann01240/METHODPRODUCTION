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
        super(Requetes.getPaysEquipe(pays));
    }
    
    @Override
    public String toString() {
        String resultat = "Coupe National de "+equipes.get(0).getNationEquipe()+"\n"
                + "==================================================================================\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+equipes.get(0).getNomEquipe()+"\n";
        return resultat;
    }
    
}
