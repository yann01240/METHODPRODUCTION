/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodologie;

import java.util.ArrayList;

/**
 *
 * @author yann01240
 */
public abstract class Competition {
    ArrayList<Equipe> equipes;

    public Competition(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }
}
