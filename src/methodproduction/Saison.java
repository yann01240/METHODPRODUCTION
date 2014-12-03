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
public class Saison {
    ArrayList<Competition> competitions;

    public Saison(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    public ArrayList<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }
    
}
