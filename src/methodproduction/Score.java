/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Equipe;

/**
 *
 * @author TabiZz
 */
public class Score {

    private Equipe equipeA;
    private Equipe equipeB;
    private int scoreA, scoreB;

    public Score(Equipe equipeA, int scoreA, Equipe equipeB, int scoreB) {
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public Equipe getEquipeA() {
        return equipeA;
    }

    public void setEquipeA(Equipe equipeA) {
        this.equipeA = equipeA;
    }

    public Equipe getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(Equipe equipeB) {
        this.equipeB = equipeB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    @Override
    public String toString() {
        String offset = "";
        if (equipeA.getNomEquipe().length() > equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeA.getNomEquipe().length() - equipeB.getNomEquipe().length() - 1; i++) {
                offset += " ";
            }
            return equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe() + offset;
        } else if (equipeA.getNomEquipe().length() < equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeB.getNomEquipe().length() - equipeA.getNomEquipe().length() - 1; i++) {
                offset += " ";
            }
            return offset + equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe();

        } else {

            return equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe();
        }
    }

}
