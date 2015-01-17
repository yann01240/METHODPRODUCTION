/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;
import packModele.Requetes;

/**
 *
 * @author yann01240
 */
public class ChampionsLeague extends Europe {

    public ChampionsLeague() {
        super(Requetes.getAllEquipe());
    }
    
}
