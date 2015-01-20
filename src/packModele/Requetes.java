package packModele;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */

public class Requetes {
    
    /**
     *
     * @return la liste de toutes les équipes 
     */
    public static ArrayList<Equipe> getAllEquipe() {
        try {
            ArrayList<Equipe> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select * from `equipe`;");
            
            while (rs.next()) {
                list.add(new Equipe(rs.getString("nom_equipe"), rs.getString("nom_pays"), rs.getInt("division")));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    
    /**
     *
     * @param pays
     * @return
     */
    public static ArrayList<Equipe> getCoupeLigueEquipe(String pays) {
        try {
            ArrayList<Equipe> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select * from `equipe` where nom_pays like '"+pays+"' and (division=1 or division=2);");
            
            while (rs.next()) {
                list.add(new Equipe(rs.getString("nom_equipe"), pays, rs.getInt("division")));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    
    /**
     *
     * @param pays
     * @return
     */
    public static ArrayList<Equipe> getCoupeNationalEquipe(String pays) {
        try {
            ArrayList<Equipe> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select * from `equipe` where nom_pays like '"+pays+"';");
            
            while (rs.next()) {
                list.add(new Equipe(rs.getString("nom_equipe"), pays, rs.getInt("division")));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    
    /**
     *
     * @param pays
     * @param division
     * @return
     */
    public static ArrayList<Equipe> getPaysDivisionEquipe(String pays, int division) {
        try {
            ArrayList<Equipe> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select * from `equipe` where nom_pays like '"+pays+"' and division="+division+";");
            
            while (rs.next()) {
                list.add(new Equipe(rs.getString("nom_equipe"), pays, division));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
}
