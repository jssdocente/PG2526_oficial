package hundirflota.modelo;

/**
 * Clase base para representar los componentes de una coordenada (Fila o Columna).
 */
public abstract class Componente {
    
    protected int valor;

    public Componente(int valor) {
        this.valor = valor;
    }

    public int getValue() {
        return valor;
    }
    
    // toString() será implementado por los hijos
    @Override
    public abstract String toString();
}
