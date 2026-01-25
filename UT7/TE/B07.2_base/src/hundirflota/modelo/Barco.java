package hundirflota.modelo;

/**
 * Representa un barco en el juego.
 * Mantiene su estado de salud (vidas).
 */
public abstract class Barco {

    // TODO: Atributos: nombre (String), tamaño (int), vidas (int)
    // TODO: Atributo Blindaje (Composición)
    protected Blindaje blindaje;

    public Barco(String nombre, int tamaño, Blindaje blindaje) {
        this.blindaje = blindaje;
        // TODO: Inicializar resto de atributos.
    }

    /**
     * Gestiona el impacto recibido delegando en el blindaje.
     */
    public void recibirImpacto() {
        // TODO: Delegar en blindaje.recibirImpacto(1) y restar vida si corresponde.
    }

    /**
     * @return true si las vidas han llegado a 0
     */
    public boolean estaHundido() {
        // TODO
        return false;
    }

    /**
     * Habilidad especial específica de cada barco.
     */
    public abstract void activarHabilidadEspecial(Tablero tableroObjetivo, Coordenada objetivo);

    // TODO: Getters
}
