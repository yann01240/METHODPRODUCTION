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

/**
 *
 * @author yann01240
 */
public abstract class Competition implements Simulation {

    private ArrayList<Equipe> tmp;
    ArrayList<Equipe> equipes;
    ArrayList<String> scores;

    public Competition(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
        scores = new ArrayList<>();
        Collections.shuffle(this.equipes,new Random(System.nanoTime()));
        tmp=new ArrayList<>();
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
        scores.add(equipeA.getNomEquipe()+" "+scoreA+" - "+scoreB+" "+equipeB.getNomEquipe());
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
