package hundirflota.modelo;

public class Columna extends Componente {

    /**
     * @param letra Letra de la columna (A, B, C...) con la que calcular el valor numérico (0, 1, 2...)
     */
    public Columna(String letra) {
        // TODO: Convertir la letra a número. 
        // Pista: 'A' es 65 en ASCII. 'A' - 'A' = 0. 'B' - 'A' = 1.
        super(0); // Cambiar este 0 por el cálculo real
    }
    
    /**
     * Constructor para uso interno numérico
     */
    public Columna(int valor) {
        super(valor);
    }

    @Override
    public String toString() {
        // TODO: Convertir el valor numérico de vuelta a Letra (0 -> "A")
        return "";
    }
}
