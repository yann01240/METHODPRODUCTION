/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import java.util.ArrayList;
import packVue.MaFenetre;

/**
 *
 * @author yann01240
 */
public class Methodproduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MaFenetre fen = new MaFenetre();
//        fen.setVisible(true);

        ArrayList<Competition> c = new ArrayList<>();
        c.add(new Division1("France"));
        c.add(new Division1("Allemagne"));
        c.add(new Division1("Belgique"));
        c.add(new Division1("Angleterre"));
        c.add(new Division1("Turquie"));
        c.add(new Division1("Italie"));
        c.add(new Division1("Espagne"));
        c.add(new Division2("France"));
        c.add(new Division2("Allemagne"));
        c.add(new Division2("Belgique"));
        c.add(new Division2("Angleterre"));
//        c.add(new Division2("Turquie"));
        c.add(new Division2("Italie"));
        c.add(new Division2("Espagne"));
        Competition ch = new ChampionsLeague();
        Competition eu = new EuropaLeague();
        for (Competition comp : c) {
            comp.simulation();
            System.out.println(comp.classement());
            try {
                
            ch.addAllEquipes(comp.selectionChampions());
            eu.addAllEquipes(comp.selectionEuropa());
            } catch (Exception e) {
            }
        }
        ch.simulation();
        eu.simulation();
        System.out.println(eu);
        System.out.println(ch);
    }

}
