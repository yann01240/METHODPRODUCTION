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
public abstract class National extends Competition {
    String pays;

    public National(ArrayList<Equipe> equipes) {
        super(equipes);
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
}
