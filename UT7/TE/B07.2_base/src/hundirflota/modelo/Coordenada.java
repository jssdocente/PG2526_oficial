package hundirflota.modelo;

/**
 * Representa una posición (fila, columna) en el tablero.
 * Compuesta por objetos Fila y Columna.
 */
public class Coordenada {
    
    private Fila fila;
    private Columna columna;

    /**
     * Constructor numérico directo
     */
    public Coordenada(int numFila, int numColumna) {
        this.fila = new Fila(numFila);
        this.columna = new Columna(numColumna);
    }

    /**
     * Constructor que parsea un String tipo "A5" o "C10"
     * Sintaxis: [Letra Columna][Número Fila]
     */
    public Coordenada(String coordenada) {
        // TODO: 
        // 1. Extraer la primera letra para la columna -> "A"
        // 2. Extraer el resto para la fila -> "5"
        // 3. Instanciar this.columna = new Columna(letra);
        // 4. Instanciar this.fila = new Fila(numero);
    }

    public int getFila() {
        return fila.getValue();
    }

    public int getColumna() {
        return columna.getValue();
    }

    @Override
    public String toString() {
        // Ejemplo: "A-5"
        return columna.toString() + "-" + fila.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coordenada otra = (Coordenada) obj;
        return this.getFila() == otra.getFila() && this.getColumna() == otra.getColumna();
    }
}
