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
public class Division2 extends Championnat {

    public Division2(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays,2));
    }

}
