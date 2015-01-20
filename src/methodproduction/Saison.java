
package methodproduction;

import java.util.ArrayList;

// ---------------------------------------------------------------
//			Classe qui regroupe l'ensemble du projet 
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public class Saison {
    ArrayList<Competition> competitions;

    /**
     * Constructeur de la classe Saison
     */
    public Saison() {
        this.competitions = new ArrayList<>();
    }

    /**
     * Constructeur de Saison
     * @param competitions
     */
    public Saison(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    /**
     *
     * @return la liste des competitions
     */
    public ArrayList<Competition> getCompetitions() {
        return competitions;
    }
    
    /**
     *
     * @param competitions
     */
    public void setCompetitions(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }
    
    /**
     *
     * @param competition
     */
    public void addCompetition(Competition competition) {
        this.competitions.add(competition);
    }
    
    /**
     *
     * @param competition
     */
    public void removeCompetition(Competition competition) {
        this.competitions.remove(competition);
    }
    
    /**
     * Vider la liste des Competitions
     */
    public void clearCompetitions(){
        this.competitions.clear();
    }
    
}
