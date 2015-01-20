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
public abstract class National extends Competition {
    
    public National(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
}
