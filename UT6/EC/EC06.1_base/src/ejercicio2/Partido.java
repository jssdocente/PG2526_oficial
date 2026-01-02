package ejercicio2;

/**
 * Representa un partido de fútbol en la quiniela.
 * Encapsula los equipos y el resultado del encuentro.
 */
public class Partido {

    // TODO: Define atributos privados: equipoLocal, equipoVisitante, golesLocal, golesVisitante, jugado (boolean)

    /**
     * Constructor del Partido
     * @param local Nombre del equipo local
     * @param visitante Nombre del equipo visitante
     */
    public Partido(String local, String visitante) {
        // TODO: Inicializa los nombres. Los goles empiezan a 0 y jugado a false.
    }

    /**
     * Establece el resultado final del partido.
     * @param golesL Goles del equipo local
     * @param golesV Goles del equipo visitante
     */
    public void setResultado(int golesL, int golesV) {
        // TODO: Asigna los goles y marca el partido como jugado (true)
    }

    /**
     * Calcula el signo de la quiniela según el resultado.
     * @return "1" si ganó local, "X" si empate, "2" si ganó visitante
     */
    public String getResultadoQuiniela() {
        // TODO: Implementa la lógica usando if/else
        return "-";
    }

    /**
     * Devuelve una representación en texto del partido.
     * Ejemplo: "Real Madrid vs Barcelona [2-1] -> (1)"
     */
    @Override
    public String toString() {
        // TODO: Construye y devuelve el String con el formato solicitado
        return "";
    }
}
