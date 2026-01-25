package hundirflota;

import hundirflota.modelo.*;

public class TestManual {

    public static void main(String[] args) {
        System.out.println("=== LABORATORIO DE PRUEBAS MANUALES ===");
        System.out.println("Descomenta las líneas que quieras probar según tu Rol.");

        // -----------------------------------------------------------------------------
        // 👩‍💻 ROL A: INGENIERO DE ESTRUCTURAS (Coordenadas y Tablero)
        // -----------------------------------------------------------------------------

        // pruebaCoordenadas();
        // pruebaVisualizacion();

        // -----------------------------------------------------------------------------
        // 👨‍✈️ ROL B: ALMIRANTE DE LA FLOTA (Barcos y Blindajes)
        // -----------------------------------------------------------------------------

        // pruebaBlindajes();
        // pruebaBarcos();
    }

    // =============================================================================
    // ZONA ROL A
    // =============================================================================

    private static void pruebaCoordenadas() {
        System.out.println("\n--- Probando Coordenadas ---");
        // TODO: Descomentar cuando Coordenada esté implementada
        /*
         * Coordenada c1 = new Coordenada("A5");
         * System.out.println("C1: " + c1); // Debería imprimir A-5
         * 
         * Coordenada c2 = new Coordenada("A5");
         * if (c1.equals(c2)) {
         * System.out.println("✅ OK: Las coordenadas son iguales.");
         * } else {
         * System.out.println("❌ ERROR: Las coordenadas deberían ser iguales.");
         * }
         */
    }

    private static void pruebaVisualizacion() {
        System.out.println("\n--- Probando Visualización del Tablero ---");
        // TODO: Descomentar para probar
        /*
         * Tablero t = new Tablero();
         * System.out.
         * println("Debería verse un tablero vacío de 10x10 lleno de agua (~):");
         * t.mostrar(false);
         */
    }

    // =============================================================================
    // ZONA ROL B
    // =============================================================================

    private static void pruebaBlindajes() {
        System.out.println("\n--- Probando Blindajes ---");

        // Prueba Blindaje Simple
        Blindaje bSimple = new BlindajeSimple();
        int danio = bSimple.recibirImpacto(1);
        System.out.println("Blindaje Simple recibe 1 daño -> Pasa: " + danio + " (Esperado: 1)");

        // Prueba Blindaje Reforzado (Implementar primero la clase)
        /*
         * Blindaje bRef = new BlindajeReforzado();
         * System.out.println("Reforzado (1er impacto) -> Pasa: " +
         * bRef.recibirImpacto(1) + " (Esperado: 0)");
         * System.out.println("Reforzado (2do impacto) -> Pasa: " +
         * bRef.recibirImpacto(1) + " (Esperado: 1)");
         */
    }

    private static void pruebaBarcos() {
        System.out.println("\n--- Probando Barcos ---");
        // TODO: Descomentar cuando existan subclases de Barco y la clase abstracta esté
        // lista
        /*
         * // Creamos un Submarino con Blindaje Simple
         * // Nota: Asumimos que Submarino tiene constructor (Blindaje b)
         * // Barco b = new Submarino(new BlindajeSimple());
         * 
         * // b.recibirImpacto();
         * // System.out.println("Vidas tras impacto: " + b.getVidas()); // Debería
         * haber bajado
         */
    }
}
