
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// ----------------------------------------------------------------------------------
//           La classe mère de toutes les competitions (coupes/championnat) 
// ----------------------------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */

public abstract class Competition implements Simulation {

    private ArrayList<Equipe> tmp;
    ArrayList<Equipe> equipes;
    ArrayList<String> scores;
    String pays;
    Equipe vainqueur;

    /**
     *
     * @param equipes
     * @param pays
     */
    public Competition(ArrayList<Equipe> equipes, String pays) {
        this.equipes = equipes;
        this.pays=pays;
        scores = new ArrayList<>();
        Collections.shuffle(this.equipes,new Random(System.nanoTime()));
        tmp=new ArrayList<>();
        System.out.println(equipes);
    }

    /**
     *
     * @return une equipe
     */
    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }
    
    /**
     *
     * @return un pays
     */
    public String getPays() {
        return pays;
    }

    /**
     *
     * @param equipes
     */
    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    /**
     *
     * @param equipe
     */
    public void addEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }
    
    /**
     *
     * @param equipes
     */
    public void addAllEquipes(ArrayList<Equipe> equipes) {
        this.equipes.addAll(equipes);
    }

    /**
     *
     * @param equipe
     */
    public void removeEquipe(Equipe equipe) {
        this.equipes.remove(equipe);
    }

    /**
     * Vider la liste d'équipes
     */
    public void clearEquipes() {
        this.equipes.clear();
    }

    /**
     *
     * @param equipeA
     * @param equipeB
     */
    public void match(Equipe equipeA, Equipe equipeB) {
        int scoreA = (int) (Math.random() * 6), scoreB = (int) (Math.random() * 6);
        while(scoreA==scoreB){
            scoreA = (int) (Math.random() * 6); scoreB = (int) (Math.random() * 6);
        }
        if (scoreA<scoreB) {
            tmp.add(equipeB);
        }else if(scoreA>scoreB) {
            tmp.add(equipeA);
        }
        equipes.remove(equipeA);
        equipes.remove(equipeB);
        
        String offset = "";
        if (equipeA.getNomEquipe().length() > equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeA.getNomEquipe().length() - equipeB.getNomEquipe().length(); i++) {
                offset += " ";
            }
            scores.add(equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe() + offset);
        } else if (equipeA.getNomEquipe().length() < equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeB.getNomEquipe().length() - equipeA.getNomEquipe().length(); i++) {
                offset += " ";
            }
            scores.add(offset + equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe());

        } else {

            scores.add(equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe());
        }
    }

    /**
     * Simule la disposition des équipes
     */
    @Override
    public void simulation() {
        parcours();
        if (tmp.size()==1){
            vainqueur=tmp.get(0);
        }
        if (tmp.size() >= 2) {
            equipes.addAll(tmp);
            tmp.clear();
            simulation();
        }
    }

    /**
     * Simule le parcours des équipes dans la phase final
     */
    public void parcours() {
        if (equipes.size() >= 2) {
            match(equipes.get(0), equipes.get(1));
            parcours();
        }
    }
    
    /**
     *
     * @return les 4 5 6eme équipes de la division 1
     */
    @Override
    public ArrayList<Equipe> selectionEuropa(){return null;}
    
    /**
     *
     * @return les 1,  2 et 3eme équipes de la division 1
     */
    @Override
    public ArrayList<Equipe> selectionChampions(){return null;}
    
    /**
     *
     * @return le Classement 
     */
    @Override
    public String classement(){return null;}
    
}
