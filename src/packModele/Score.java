
package packModele;
//			Classe pour afficher les Score des matchs
// ---------------------------------------------------------------

/**
 *
 * @author JOYARD_LEROUX_CHAVEL_CHARPY
 */


public class Score {

    private Equipe equipeA;
    private Equipe equipeB;
    private int scoreA, scoreB;

    /**
     *
     * @param equipeA
     * @param scoreA
     * @param equipeB
     * @param scoreB
     */
    public Score(Equipe equipeA, int scoreA, Equipe equipeB, int scoreB) {
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    /**
     *
     * @return le nom de l'équipe A
     */
    public Equipe getEquipeA() {
        return equipeA;
    }

    /**
     *
     * @param equipeA
     */
    public void setEquipeA(Equipe equipeA) {
        this.equipeA = equipeA;
    }

    /**
     *
     * @return le nom de l'équipe B
     */
    public Equipe getEquipeB() {
        return equipeB;
    }

    /**
     *
     * @param equipeB
     */
    public void setEquipeB(Equipe equipeB) {
        this.equipeB = equipeB;
    }

    /**
     *
     * @return le score de l'équipe A
     */
    public int getScoreA() {
        return scoreA;
    }

    /**
     *
     * @param scoreA
     */
    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    /**
     *
     * @return le score de l'équipe B
     */
    public int getScoreB() {
        return scoreB;
    }

    /**
     *
     * @param scoreB
     */
    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    @Override
    public String toString() {
        String offset = "";
        if (equipeA.getNomEquipe().length() > equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeA.getNomEquipe().length() - equipeB.getNomEquipe().length() - 1; i++) {
                offset += " ";
            }
            return equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe() + offset;
        } else if (equipeA.getNomEquipe().length() < equipeB.getNomEquipe().length()) {
            for (int i = 0; i < equipeB.getNomEquipe().length() - equipeA.getNomEquipe().length() - 1; i++) {
                offset += " ";
            }
            return offset + equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe();

        } else {

            return equipeA.getNomEquipe() + " " + scoreA + " - " + scoreB + " " + equipeB.getNomEquipe();
        }
    }

}
