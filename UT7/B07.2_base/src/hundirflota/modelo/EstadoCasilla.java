package hundirflota.modelo;

/**
 * Representa el estado de una casilla en el tablero.
 */
public enum EstadoCasilla {
    AGUA,           // No hay nada y no se ha disparado
    AGUA_DISPARADA, // Había agua y se ha disparado (Fallo)
    BARCO,          // Hay un barco intacto (oculto al enemigo)
    TOCADO,         // Había un barco y ha sido impactado
    HUNDIDO         // (Opcional) Si quieres marcar visualmente los barcos hundidos completos
}
