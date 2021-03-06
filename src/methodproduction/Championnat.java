package methodproduction;

import packModele.Score;
import packModele.EquipeComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import packModele.Equipe;


// ---------------------------------------------------------------
//			Cette classe regroupe Division 1 et 2 
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public abstract class Championnat extends National {

    private ArrayList<Equipe>[] jours;
    private ArrayList<Score>[] journees;

    /**
     *
     * @param equipes
     * @param pays
     */
    public Championnat(ArrayList<Equipe> equipes, String pays) {
        super(equipes, pays);
        if (this.equipes.size() % 2 != 0) {
            this.equipes.remove((int) (Math.random() * this.equipes.size()));
        }

        jours = new ArrayList[(this.equipes.size() - 1)];
        journees = new ArrayList[(this.equipes.size() - 1) * 2];

        for (int i = 0; i < jours.length; i++) {
            jours[i] = new ArrayList<>();
        }

        for (int i = 0; i < journees.length; i++) {
            journees[i] = new ArrayList<>();
        }

        jours[0].addAll(this.equipes);
        for (int i = 1; i < jours.length; i++) {
            jours[i].addAll(jours[i - 1]);
            jours[i].add(jours[i].get(1));
            jours[i].remove(1);
        }
    }
    
    /**
     *
     * @param match
     */
    public void match(Score match) {
        int scoreA = (int) (Math.random() * 5), scoreB = (int) (Math.random() * 5);
        Equipe equipeA = match.getEquipeA(), equipeB = match.getEquipeB();
        match.setScoreA(scoreA);
        match.setScoreB(scoreB);
        if (scoreA > scoreB) {
            equipeA.setPoint(equipeA.getPoint() + 3);
        } else if (scoreA == scoreB) {
            equipeB.setPoint(equipeB.getPoint() + 1);
            equipeA.setPoint(equipeA.getPoint() + 1);
        } else {
            equipeB.setPoint(equipeB.getPoint() + 3);
        }

    }

    /**
     * Fonction pour la simulation des matchs
     */
    @Override
    public void simulation() {
        repartition();
        for (int i = 0; i < journees.length; i++) {
            for (int j = 0; j < journees[i].size(); j++) {
                match(journees[i].get(j));
            }
        }
        Collections.sort(equipes, new EquipeComparator());
    }

// ---------------------------------------------------------------
//			Classement
// ---------------------------------------------------------------
    
    /**
     *
     * @return le classement des equipes selon leurs points
     */
        
    @Override
    public String classement() {
        int max = 10;
        String ligne = "";
        for (int i = 0; i < max + 2; i++) {
            ligne += "=";
        }
        String resultat = "Classement Championnat de " + equipes.get(0).getNationEquipe() + " de Division " + equipes.get(0).getDivision() + "\n" + ligne + "\n";
        for (Equipe equipe : equipes) {
            resultat += equipe.getNomEquipe() + " " + equipe.getPoint() + "pts\n";
        }
        resultat += "\nMatchs\n" + ligne + "\n";
        for (int i = 0; i < journees.length; i++) {
            Collections.shuffle(journees[i], new Random(System.nanoTime()));
            resultat += "Journee " + (i + 1) + ":\n";
            for (Score match : journees[i]) {
                resultat += match + "\n";
            }
            resultat += "\n";
        }
        return resultat;
    }


    /**
     * Repartition des matchs
     */
    public void repartition() {
        for (int i = 0; i < jours.length; i++) {
            while (!jours[i].isEmpty()) {
                journees[i].add(new Score(jours[i].get(0), 0, jours[i].get(jours[i].size() - 1), 0));
                journees[i + jours.length].add(new Score(jours[i].get(jours[i].size() - 1), 0, jours[i].get(0), 0));
                jours[i].remove(0);
                jours[i].remove(jours[i].size() - 1);
            }
        }
    }

    @Override
    public String toString() {
        return classement();
    }

}
