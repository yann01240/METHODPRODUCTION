/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import java.util.ArrayList;

/**
 *
 * @author yann01240
 */
public class Division2 extends Championnat {

    private Equipe[] tab;

    public Division2(String nom, ArrayList<Equipe> equipes) {
        super(nom, equipes);
    }

    public void Classement_D2() {
        for (int i = 0; i < equipes.size(); i++) {
            tab[i] = equipes.get((int) Math.random() * 10);
            for (int j = 0; j < tab.length; j++) {
                if (tab[i].equals(tab[j])) {
                    i--;
                    continue;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + "  " + tab[i]);
        }
    }
}
