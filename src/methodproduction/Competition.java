/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import packModele.Equipe;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author yann01240
 */
public abstract class Competition {

    ArrayList<Equipe> equipes;

    public Competition(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void loadFileCSV() {
        String ligne;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                FileInputStream fichier_int = new FileInputStream(fileChooser.getSelectedFile());
                InputStreamReader inputs = new InputStreamReader(fichier_int, "Latin1");
                try (BufferedReader input = new BufferedReader(inputs)) {
                    while ((ligne = input.readLine()) != null) {    
                        equipes.add(new Equipe("nom", "nation")); // à modifier
                    }
                    System.out.println("Liste chargee");
                }
            }
        } catch (HeadlessException | IOException exception) {
            System.out.println("Probleme import csv");
        }
    }
}
