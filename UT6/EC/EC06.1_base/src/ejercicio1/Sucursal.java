package ejercicio1;

/**
 * Representa una sucursal de la empresa.
 * Gestiona sus propias ventas de forma independiente.
 */
public class Sucursal {

    // TODO: Define atributos: id (int), cantidadesVendidas (int[])

    /**
     * Constructor de la Sucursal
     * @param id Identificador de la sucursal
     * @param numTotalArticulos Número total de artículos que existen en el catálogo (para saber el tamaño del array)
     */
    public Sucursal(int id, int numTotalArticulos) {
        // TODO: Inicializa el id y crea el array cantidadesVendidas con el tamaño adecuado
    }

    /**
     * Registra la venta de un artículo.
     * @param indiceArticulo La posición del artículo en el catálogo (0, 1, 2...)
     * @param cantidad La cantidad de unidades vendidas
     */
    public void registrarVenta(int indiceArticulo, int cantidad) {
        // TODO: Suma la cantidad en la posición indicada del array cantidadesVendidas
    }

    /**
     * Calcula cuánto dinero ha recaudado esta sucursal.
     * @param catalogo El array con todos los artículos disponibles (necesario para saber el precio de cada uno)
     * @return El total en euros recaudado
     */
    public double obtenerRecaudacion(Articulo[] catalogo) {
        double total = 0.0;
        // TODO: Recorre el array de cantidadesVendidas.
        // Multiplica la cantidad vendida de cada posición por el precio del artículo correspondiente del catálogo.
        return total;
    }

    /**
     * @return La suma total de unidades vendidas de todos los productos
     */
    public int getCantidadTotalArticulos() {
        // TODO: Recorre el array y suma todas las cantidades
        return 0;
    }
    
    // TODO: Añade un Getter para el ID si lo necesitas
}
