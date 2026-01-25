package hundirflota.modelo;

public class BlindajeEvasivo implements Blindaje {

    @Override
    public int recibirImpacto(int danioEntrante) {
        // TODO: Generar un número aleatorio.
        // Si sale dentro del % de evasión (ej. 20%), devolver 0 (esquivado).
        // Si no, devolver el daño normal.
        return danioEntrante;
    }
}
