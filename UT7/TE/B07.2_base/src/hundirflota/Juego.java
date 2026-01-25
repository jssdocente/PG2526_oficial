package hundirflota;

import hundirflota.modelo.*;

public class Juego {

    public static void main(String[] args) {
        System.out.println("=== HUNDIR LA FLOTA OOP ===");

        // 1. Crear jugadores
        Jugador humano = new JugadorHumano("Almirante");
        Jugador maquina = new JugadorMaquina("Skynet");

        // 2. Conectar tableros (cada uno necesita ver el del rival para disparar)
        humano.setTableroRival(maquina.getMiTablero()); // Necesitas crear el getter getMiTablero en Jugador
        maquina.setTableroRival(humano.getMiTablero());

        // 3. Colocación de barcos
        // TODO: Implementar lógica de colocación.
        // Para empezar, puedes "hardcodear" (poner a mano) algunos barcos para probar:
        // humano.getMiTablero().colocarBarco(new Submarino(new BlindajeSimple()), new
        // Coordenada("A1"), Direccion.ESTE);

        // 4. Bucle juego
        Jugador turnoActual = humano;

        while (humano.tieneBarcosAFlote() && maquina.tieneBarcosAFlote()) {

            // Mostrar estado (opcional: limpiar pantalla)
            if (turnoActual == humano) {
                System.out.println("--- TABLERO RIVAL ---");
                humano.getTableroRival().mostrar(true); // Ocultando barcos
                System.out.println("--- TU TABLERO ---");
                humano.getMiTablero().mostrar(false); // Viendo tus barcos
            }

            // Realizar disparo
            Coordenada disparo = turnoActual.elegirDisparo();

            // TODO: Procesar el disparo en el tablero rival y obtener resultado
            // EstadoCasilla resultado =
            // turnoActual.getTableroRival().recibirDisparo(disparo);

            // System.out.println("Resultado: " + resultado);

            // Cambiar turno
            turnoActual = (turnoActual == humano) ? maquina : humano;
        }

        System.out.println("FIN DE LA PARTIDA");
    }
}
