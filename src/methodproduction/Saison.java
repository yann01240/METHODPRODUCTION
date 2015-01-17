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

    public Saison() {
        this.competitions = new ArrayList<>();
    }

    public Saison(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    public void setCompetitions(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }
    
    public void addCompetition(Competition competition) {
        this.competitions.add(competition);
    }
    
    public void removeCompetition(Competition competition) {
        this.competitions.remove(competition);
    }
    
    public void clearCompetitions(){
        this.competitions.clear();
    }
    
}
