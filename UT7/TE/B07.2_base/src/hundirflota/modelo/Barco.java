package hundirflota.modelo;

/**
 * Representa un barco en el juego.
 * Mantiene su estado de salud (vidas).
 */
public class Barco {
    
    // TODO: Atributos: nombre (String), tamaño (int), vidas (int)

    public Barco(String nombre, int tamaño) {
        // TODO: Inicializar. Las vidas empiezan siendo igual al tamaño.
    }

    /**
     * Resta una vida al barco.
     */
    public void recibirImpacto() {
        // TODO: reducir vidas
    }

    /**
     * @return true si las vidas han llegado a 0
     */
    public boolean estaHundido() {
        // TODO
        return false;
    }
    
    // TODO: Getters
}
