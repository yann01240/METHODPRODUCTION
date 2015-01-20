
package methodproduction;

import java.util.ArrayList;
import packModele.Equipe;
import packModele.Requetes;

// ---------------------------------------------------------------
//			Division 1
// ---------------------------------------------------------------

public class Division1 extends Championnat {
    

    public Division1(String pays) {
        super(Requetes.getPaysDivisionEquipe(pays, 1),pays);
    }

    @Override
    public ArrayList<Equipe> selectionEuropa() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(3));
        tmp.add(equipes.get(4));
        tmp.add(equipes.get(5));
        return tmp;
    }

    @Override
    public ArrayList<Equipe> selectionChampions() {
        ArrayList<Equipe> tmp = new ArrayList<>();
        tmp.add(equipes.get(0));
        tmp.add(equipes.get(1));
        tmp.add(equipes.get(2));
        return tmp;
    }

}
