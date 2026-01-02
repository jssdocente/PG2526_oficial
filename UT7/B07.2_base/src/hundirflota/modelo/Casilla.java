package hundirflota.modelo;

/**
 * Representa una celda individual del tablero.
 */
public class Casilla {
    
    // TODO: Atributos: 
    // - EstadoCasilla estado (por defecto AGUA)
    // - Barco barco (referencia al barco si lo hay, null si no)

    // TODO: Constructor vacío

    // TODO: Métodos para:
    // - Saber si hay barco (return barco != null)
    // - Disparar a esta casilla:
    //    - Si es AGUA -> Pasa a AGUA_DISPARADA
    //    - Si es BARCO -> Pasa a TOCADO y avisa al barco (barco.recibirImpacto())
}
