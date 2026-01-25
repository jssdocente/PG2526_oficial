package hundirflota.modelo;

public class BlindajeSimple implements Blindaje {

    @Override
    public int recibirImpacto(int danioEntrante) {
        // TODO: Comportamiento estándar (no absorbe daño)
        return danioEntrante;
    }
}
