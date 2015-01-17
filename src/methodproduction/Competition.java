/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;

/**
 *
 * @author yann01240
 */
public abstract class Competition implements Simulation {

    ArrayList<Equipe> equipes;

    public Competition(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }
    
    public void addEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }
    
    public void removeEquipe(Equipe equipe) {
        this.equipes.remove(equipe);
    }
    
    public void clearEquipes() {
        this.equipes.clear();
    }
}
