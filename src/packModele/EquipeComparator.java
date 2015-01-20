
package packModele;

import java.util.Comparator;

// ---------------------------------------------------------------
//  Cette classe permet de comparé 2 équipes entre elles pour faire classement
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */

public class EquipeComparator implements Comparator<Equipe> {

    @Override
    public int compare(Equipe equipeA, Equipe equipeB) {
        return equipeB.compareTo(equipeA);
    }
}
