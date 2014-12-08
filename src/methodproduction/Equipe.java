/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

/**
 *
 * @author yann01240
 */
public class Equipe {
    String nomEquipe;
    String nationEquipe;

    public Equipe(String nom, String nationEquipe) {
        this.nomEquipe = nom;
        this.nationEquipe = nationEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getNationEquipe() {
        return nationEquipe;
    }

    public void setNationEquipe(String nationEquipe) {
        this.nationEquipe = nationEquipe;
    }
    
}
