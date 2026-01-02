package hundirflota.modelo;

public class JugadorMaquina extends Jugador {

    public JugadorMaquina(String nombre) {
        super(nombre);
    }

    @Override
    public Coordenada elegirDisparo() {
        System.out.println("Turno de la máquina...");
        // TODO: Generar fila y columna aleatorias.
        // Opcional: Verificar que no haya disparado ahí antes (mirando tableroRival)
        return null;
    }
}
