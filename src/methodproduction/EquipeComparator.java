/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodproduction;

import java.util.Comparator;
import packModele.Equipe;

/**
 *
 * @author TabiZz
 */
public class EquipeComparator implements Comparator<Equipe> {

    @Override
    public int compare(Equipe equipeA, Equipe equipeB) {
        return equipeB.compareTo(equipeA);
    }
}
