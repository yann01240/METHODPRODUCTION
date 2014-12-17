/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packModele;

import java.util.ArrayList;

/**
 *
 * @author Aurèle
 */
public class Pays {
    String nom;
    ArrayList<Equipe> equipes;

    public Pays(String nom, ArrayList<Equipe> equipes) {
        this.nom = nom;
        this.equipes = equipes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }
    
    
    
}
