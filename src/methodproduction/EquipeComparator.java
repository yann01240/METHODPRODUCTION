
package methodproduction;

import java.util.Comparator;
import packModele.Equipe;

// ---------------------------------------------------------------
//  Cette classe permet de comparé 2 équipes entre elles pour faire classement
// ---------------------------------------------------------------

public class EquipeComparator implements Comparator<Equipe> {

    @Override
    public int compare(Equipe equipeA, Equipe equipeB) {
        return equipeB.compareTo(equipeA);
    }
}
