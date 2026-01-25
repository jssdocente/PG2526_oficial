package hundirflota.modelo;

public interface Blindaje {

    /**
     * Calcula el daño final que recibe el barco tras aplicar la defensa.
     * 
     * @param danioEntrante Daño recibido (normalmente 1).
     * @return Daño final a aplicar (puede ser 0 si se absorbe).
     */
    int recibirImpacto(int danioEntrante);
}
