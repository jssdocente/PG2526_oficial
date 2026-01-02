package hundirflota.modelo;

/**
 * Gestiona la cuadrícula de juego.
 */
public class Tablero {
    
    public static final int TAMAÑO = 10;
    // TODO: Matriz de Casillas [TAMAÑO][TAMAÑO]

    public Tablero() {
        // TODO: Inicializar la matriz y rellenarla de objetos Casilla nuevos
    }

    /**
     * Intenta colocar un barco en la posición y dirección indicadas.
     * @return true si se pudo colocar, false si no cabía o se solapaba
     */
    public boolean colocarBarco(Barco b, Coordenada inicio, Direccion d) {
        // TODO: 
        // 1. Calcular las coordenadas que ocuparía el barco
        // 2. Verificar límites del tablero
        // 3. Verificar que no hay otros barcos (ni vecinos, para dejar agua alrededor)
        // 4. Si todo ok, asignar el barco a esas casillas y cambiar estado a BARCO
        return false;
    }

    /**
     * Procesa un disparo en la coordenada indicada.
     * @return El estado resultante de la casilla disparada (AGUA_DISPARADA, TOCADO...)
     */
    public EstadoCasilla recibirDisparo(Coordenada c) {
        // TODO: Delegar en la casilla correspondiente
        return null;
    }

    public void mostrar(boolean ocultarBarcos) {
        // TODO: Imprimir el tablero. 
        // Si ocultarBarcos es true (tablero rival), dibujar AGUA en lugar de BARCO.
    }
}
