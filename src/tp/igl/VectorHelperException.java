
package tp.igl;

/**
 * classe de gestion d'exception relative a la classe VectorHelper
 * @author Touati_Zeroual
 */
public class VectorHelperException extends Exception {

    /**
     * Constructeur vide
     */
    public VectorHelperException() {
    }

    /**
     * Constructeur qui affiche un message 
     * @param msg un message qui sera afficher quand une exception est levée par la methode sommer de la classe VectoHelper
     */
    public VectorHelperException(String msg) {
        super(msg);
    }
}
