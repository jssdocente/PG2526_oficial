package hundirflota.modelo;

/**
 * Clase abstracta que representa a un participante.
 */
public abstract class Jugador {
    
    protected String nombre;
    protected Tablero miTablero;
    protected Tablero tableroRival;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.miTablero = new Tablero();
        // El tablero rival se asignará cuando empiece el juego
    }

    public void setTableroRival(Tablero t) {
        this.tableroRival = t;
    }

    public Tablero getMiTablero() {
        return miTablero;
    }

    public Tablero getTableroRival() {
        return tableroRival;
    }

    /**
     * Método abstracto: Cada tipo de jugador decide dónde disparar de forma distinta.
     */
    public abstract Coordenada elegirDisparo();

    public boolean tieneBarcosAFlote() {
        // TODO: Recorrer miTablero o mantener un contador de barcos vivos
        return true; 
    }
}
