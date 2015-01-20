/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// ----------------------------------------------------------------------------------
//           La classe mère de toutes les competitions (coupes/championnat) 
// ----------------------------------------------------------------------------------


public abstract class Competition implements Simulation {

    private ArrayList<Equipe> tmp;
    ArrayList<Equipe> equipes;
    ArrayList<String> scores;
    String pays;

    public Competition(ArrayList<Equipe> equipes, String pays) {
        this.equipes = equipes;
        this.pays=pays;
        scores = new ArrayList<>();
        Collections.shuffle(this.equipes,new Random(System.nanoTime()));
        tmp=new ArrayList<>();
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }
    
    public String getPays() {
        return pays;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void addEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }
    
    public void addAllEquipes(ArrayList<Equipe> equipes) {
        this.equipes.addAll(equipes);
    }

    public void removeEquipe(Equipe equipe) {
        this.equipes.remove(equipe);
    }

    public void clearEquipes() {
        this.equipes.clear();
    }

    

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

    @Override
    public void simulation() {
        parcours();
        if (tmp.size() > 1) {
            equipes.addAll(tmp);
            tmp.clear();
            simulation();
        }
    }

    public void parcours() {
        if (equipes.size() >= 2) {
            match(equipes.get(0), equipes.get(1));
            parcours();
        }
    }
    
    @Override
    public ArrayList<Equipe> selectionEuropa(){return null;}
    
    @Override
    public ArrayList<Equipe> selectionChampions(){return null;}
    
    @Override
    public String classement(){return null;}
    
}
