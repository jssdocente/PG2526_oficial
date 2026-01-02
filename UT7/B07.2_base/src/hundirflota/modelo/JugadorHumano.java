package hundirflota.modelo;

public class JugadorHumano extends Jugador {

    // TODO: Scanner para leer teclado

    public JugadorHumano(String nombre) {
        super(nombre);
    }

    @Override
    public Coordenada elegirDisparo() {
        System.out.println("Tu turno, " + nombre);
        // TODO: Pedir fila y columna al usuario, validar y retornar nueva Coordenada
        return null;
    }
}
