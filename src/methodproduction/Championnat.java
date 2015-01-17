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
public abstract class Championnat extends National {

    public Championnat(ArrayList<Equipe> equipes) {
        super(equipes);
    }
}
