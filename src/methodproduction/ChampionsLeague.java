/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;
import packModele.Requetes;

/**
 *
 * @author yann01240
 */
public class ChampionsLeague extends Europe {

    public ChampionsLeague() {
        super(new ArrayList<Equipe>());
    }
    
    @Override
    public String toString() {
        String resultat = "Champions League\n"
                + "==================================================================================\n";
        for (String score : scores) {
            resultat += score + "\n";
        }
        resultat += "\nGagnant:\n"+equipes.get(0).getNomEquipe()+"\n";
        return resultat;
    }
    
}
