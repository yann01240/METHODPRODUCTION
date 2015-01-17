package packModele;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Requetes {

    private int idCurrentClient = -1;

    public Requetes() {

    }

    public int getIdCurrentClient() {
        return idCurrentClient;
    }

    public void setIdCurrentClient(int idCurrentClient) {
        this.idCurrentClient = idCurrentClient;
    }

    public ArrayList<Integer> getIdsClients() {
        try {
            ArrayList<Integer> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select `id` from `clients`");
            
            while (rs.next()) {
                list.add(rs.getInt("id"));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    /*
    public ArrayList<String> getNomsClients() {
        try {
            ArrayList<String> list = new ArrayList();
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select `nom` from `clients`");
            while (rs.next()) {
                list.add(rs.getString("nom"));
            }
            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    */
}
