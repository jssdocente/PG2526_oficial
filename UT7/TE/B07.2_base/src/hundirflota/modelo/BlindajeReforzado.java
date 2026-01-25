package hundirflota.modelo;

public class BlindajeReforzado implements Blindaje {

    // TODO: atributo para controlar si sigue intacto (ej. boolean intacto = true)

    @Override
    public int recibirImpacto(int danioEntrante) {
        // TODO: Si está intacto, absorber el daño (return 0) y romper el blindaje.
        // Si ya estaba roto, devolver el daño normal.
        return danioEntrante;
    }
}
