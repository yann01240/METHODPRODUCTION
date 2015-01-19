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
public class Division1 extends Championnat {
    

    public Division1(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays, 1));
    }

    @Override
    public ArrayList<Equipe> selectionEuropa() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(3));
        tmp.add(equipes.get(4));
        tmp.add(equipes.get(5));
        return tmp;
    }

    @Override
    public ArrayList<Equipe> selectionChampions() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(0));
        tmp.add(equipes.get(1));
        tmp.add(equipes.get(2));
        return tmp;
    }

}
