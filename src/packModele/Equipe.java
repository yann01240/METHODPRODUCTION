/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packModele;

/**
 *
 * @author yann01240
 */
public class Equipe {

    private String nomEquipe;
    private String nationEquipe;
    private int division;
    private int point;

    public Equipe(String nom, String nationEquipe, int division) {
        this.nomEquipe = nom;
        this.nationEquipe = nationEquipe;
        this.division = division;
        point = 0;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Equipe{" + "nomEquipe=" + nomEquipe + ", nationEquipe=" + nationEquipe + ", division=" + division + ", point=" + point + '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Equipe equipe = (Equipe) obj;
        return point == equipe.point && nomEquipe == equipe.getNomEquipe() && nationEquipe == equipe.getNationEquipe();

    }

    public int compareTo(Equipe equipe) {
        return new Integer(this.point).compareTo(equipe.point);
    }

}
