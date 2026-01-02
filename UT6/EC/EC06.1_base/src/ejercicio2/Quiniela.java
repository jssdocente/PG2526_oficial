package ejercicio2;

/**
 * Clase principal para gestionar la jornada de la quiniela.
 */
public class Quiniela {

    public static void main(String[] args) {
        // 1. Crear la jornada (Array de Partidos)
        int numPartidos = 3; // TODO: Cambiar a 15 para el ejercicio real, ponemos 3 para probar rápido
        // TODO: Declara el array de objetos Partido
        Partido[] jornada = new Partido[numPartidos];
        

        // 2. Definir los partidos
        System.out.println("--- GENERANDO JORNADA ---");
        // TODO: Instancia cada posición del array con un "new Partido(local, visitante)"
        // Ej: jornada[0] = new Partido("Osasuna", "Athletic");

        // 3. Simular Resultados
        System.out.println("--- JUGANDO PARTIDOS ---");
        // TODO: Asigna resultados arbitrarios o pídelos por teclado usando setResultado()
        
        // 4. Imprimir la Quiniela
        System.out.println("\n--- RESULTADOS DE LA QUINIELA ---");
        // TODO: Recorre el array (bucle for-each) e imprime cada objeto. 
        // Al tener el método toString() implementado, System.out.println(partido) funcionará mágicamente.
    }
}
