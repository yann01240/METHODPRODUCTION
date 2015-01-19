/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;

/**
 *
 * @author yann01240
 */
public interface Simulation {
    
    public void simulation ();
    
    public ArrayList<Equipe> selectionEuropa();
    public ArrayList<Equipe> selectionChampions();
    public String classement();
      
    
}
