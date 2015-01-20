package methodproduction;

import packModele.Equipe;
import java.util.ArrayList;


// ---------------------------------------------------------------
//			Classe mère des deux coupes Européennes
// ---------------------------------------------------------------

public abstract class Europe extends Competition {

    public Europe(ArrayList<Equipe> equipes) {
        super(equipes,null);
    }

}
