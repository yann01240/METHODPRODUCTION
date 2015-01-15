/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packModele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnexionBD {

    ArrayList<Pays> listPays;
    private static Connection connect = null;

    
    //Connexion a la base de donnée "scaryShop.sqlite"
    public ConnexionBD() {
        if (connect == null) {
            try {
                Class.forName("org.sqlite.JDBC").newInstance();

                //on r�cup�re le nom de la bd dans le fichier nomBD.txt
                connect = DriverManager.getConnection("jdbc:sqlite:fifa.sqlite ");
                System.out.println("Connexion etablie");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                connect = null;
                System.err.println(ex.getMessage());
            }
        }
    } 
    

    //Fonction qui vérifie la connexion
    public static Connection getConnexion() {
        if (connect == null) {
            ConnexionBD connexionBD = new ConnexionBD();
            System.out.println("Connexion etablie");
        }
        return connect;
    }

}
