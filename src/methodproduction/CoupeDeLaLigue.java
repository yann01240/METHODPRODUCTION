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
public class CoupeDeLaLigue extends Coupe {

    public CoupeDeLaLigue(String pays) {
        super(Requetes.getPaysEquipe(pays));
    }
    
}
