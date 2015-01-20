
package methodproduction;

import java.util.ArrayList;

// ---------------------------------------------------------------
//			Classe qui regroupe l'ensemble du projet 
// ---------------------------------------------------------------

public class Saison {
    ArrayList<Competition> competitions;

    public Saison() {
        this.competitions = new ArrayList<>();
    }

    public Saison(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    public ArrayList<Competition> getCompetitions() {
        return competitions;
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
