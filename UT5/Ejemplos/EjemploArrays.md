# Ejemplos de Arrays

### **Ejemplo1**

Este método se centra en las diferentes formas de **declarar, inicializar y recorrer** arrays de una dimensión.

```java
public static void ejemplo1() {
    System.out.println("EJEMPLO 1");

    // DECLARACIÓN E INICIALIZACIÓN DE ARRAYS

    // Creamos un array de 5 elementos de tipo 'float'. Se inicializa automáticamente
    // con el valor por defecto para float, que es 0.0.
    float floats[] = new float[5];

    // Creamos un array de 5 elementos de tipo 'char'. Se inicializa con el carácter nulo ('\u0000').
    char[] chars = new char[5];

    // Creamos un array de Strings inicializando sus valores directamente.
    // Java cuenta los elementos (4 en este caso) y le da ese tamaño al array.
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    
    // Creamos un array de enteros (int) inicializando también sus valores.
    int[] myNum = { 10, 20, 30, 40 };

    // RECORRIDO DE ARRAYS

    // 1. Bucle 'for' clásico: recorremos el array 'cars' usando un índice.
    // El bucle va desde el índice 0 hasta el último índice (cars.length - 1).
    for (int i = 0; i < cars.length; i++) {
        // Imprimimos el elemento en la posición 'i' y un espacio.
        System.out.print(cars[i]+ " ");
    }
    System.out.println(); // Imprime un salto de línea para separar las salidas.

    // 2. Bucle 'for-each' o 'for mejorado': es más simple y legible.
    // Por cada 'numero' en el array 'myNum', ejecuta el bloque de código.
    for (int numero : myNum) {
        // Imprimimos el valor del elemento actual y un espacio.
        System.out.print(numero + " ");
    }
    System.out.println(); // Salto de línea.

    // IMPRESIÓN DE ARRAYS

    // 3. Usando Arrays.toString(): esta es la forma recomendada para visualizar el contenido
    // completo de un array de una dimensión. Devuelve una cadena de texto formateada.
    System.out.println(Arrays.toString(cars));

    // 4. Impresión directa del objeto array: esto NO imprime el contenido.
    // Lo que imprime es la "referencia" del objeto: el tipo de objeto ([Ljava.lang.String;)
    // seguido de un '@' y su código hash en hexadecimal. No es útil para ver los datos.
    System.out.println(cars);
}
```

**Explicación detallada:**

*   **Declaración**: Se muestran las dos formas básicas de crear un array:
    1.  `new float[5]`: Reservando espacio para un número fijo de elementos. Los valores iniciales son los predeterminados por el tipo de dato (`0` para números, `false` para booleanos, `null` para objetos).
    2.  `{ "Volvo", ... }`: Proporcionando una lista de valores iniciales. Java infiere el tamaño del array automáticamente.
*   **Recorrido**:
    *   El **bucle `for` clásico** es útil cuando necesitas el **índice** del elemento (la variable `i`), por ejemplo, para modificar ese elemento o relacionarlo con otro array.
    *   El **bucle `for-each`** es más limpio y seguro cuando solo necesitas **leer** los valores del array, uno tras otro, sin preocuparte por su posición.
*   **Impresión**: Queda clara la diferencia fundamental entre imprimir un array directamente (`System.out.println(cars)`) y usar la utilidad `Arrays.toString(cars)`. Lo primero nos da una referencia a la memoria, que no nos dice nada sobre su contenido. Lo segundo nos muestra los elementos de forma clara y legible.

---

### **Ejemplo2**

Este ejemplo es crucial para entender la diferencia entre **copiar la referencia** de un array y **crear una copia real** de su contenido.

```java
public static void ejemplo2() {
    System.out.println("EJEMPLO 2");

    // Creamos un array de enteros original.
    int[] array = { 2, 4, 8, 12, 16, 18, 20, 10 };

    // 1. Asignación de referencia: 'array2' NO es un nuevo array.
    // 'array2' es otra "etiqueta" o "puntero" que apunta AL MISMO objeto en memoria que 'array'.
    int[] array2 = array;

    // 2. Copia real con .clone(): 'array3' es un objeto NUEVO e independiente
    // que tiene una copia exacta de los elementos de 'array' en el momento de la clonación.
    int[] array3 = array.clone();

    // 3. Copia real con Arrays.copyOf(): Crea un nuevo array 'array4'
    // copiando los primeros 5 elementos de 'array3'.
    int[] array4 = Arrays.copyOf(array3, 5);

    // 4. Copia de un rango con Arrays.copyOfRange(): Crea un nuevo array 'array5'
    // copiando los elementos de 'array' desde el índice 2 (incluido) hasta el 6 (excluido).
    int[] array5 = Arrays.copyOfRange(array, 2, 6);

    // MODIFICAMOS EL ARRAY ORIGINAL
    // Cambiamos el valor del primer elemento (índice 0) del 'array' original.
    array[0] = 4;

    // OBSERVAMOS LOS RESULTADOS
    // Al modificar 'array', 'array2' también cambia, porque son el mismo objeto.
    // Los demás arrays ('array3', 'array4', 'array5') no se ven afectados porque son copias independientes.
    System.out.println("Array original:              " + Arrays.toString(array));
    System.out.println("Array2, comparte referencia: " + Arrays.toString(array2));
    System.out.println("Array3, copia del original:  " + Arrays.toString(array3));
    System.out.println("Array4, copia del original:  " + Arrays.toString(array4));
    System.out.println("Array5, copia del original:  " + Arrays.toString(array5));
}
```

**Explicación detallada:**

*   **`array2 = array` (Asignación de referencia)**: Imagina que `array` es un mando a distancia que controla una tele. Esta línea no te da una tele nueva, te da **otro mando a distancia idéntico que controla la misma tele**. Si cambias de canal con un mando, el cambio se ve en la única tele que hay. Por eso, al modificar `array[0]`, el cambio se refleja en `array2`.
*   **`array.clone()` y `Arrays.copyOf()` (Copia real)**: Siguiendo la analogía, estos métodos son como ir a la tienda y **comprar una tele nueva** y un mando nuevo. Tienes una copia exacta, pero es un aparato independiente. Si cambias el canal en la tele original, la nueva no se entera. Por eso `array3`, `array4` y `array5` no se ven afectados por la modificación de `array[0]`.

---

### **Ejemplo3**

Este método demuestra un algoritmo básico de **búsqueda lineal** en un array.

```java
public static void ejemplo3() {
    System.out.println("EJEMPLO 3");

    // Array en el que vamos a buscar.
    int[] array = { 2, 4, 8, 12, 16, 18, 20, 10 };
    // El valor que queremos encontrar.
    int buscar = 16;
    
    // Usamos un bucle for-each para recorrer cada elemento del array.
    // La variable 'i' tomará el valor de cada elemento en cada iteración (2, luego 4, luego 8...).
    for (int i : array) {
        // Comparamos el elemento actual ('i') con el valor que buscamos ('buscar').
        if (i == buscar) {
            // Si son iguales, hemos encontrado el número. Imprimimos un mensaje y seguimos.
            // Nota: Este código no para al encontrarlo, seguirá recorriendo el array.
            System.out.println("Se ha encontrado el numero " + buscar);
        }
    }
}
```

**Explicación detallada:**

*   **Búsqueda lineal**: Es el método de búsqueda más simple. Consiste en revisar los elementos del array uno por uno, desde el principio hasta el final, hasta encontrar el que buscamos.
*   **Uso del `for-each`**: Es ideal para este caso, ya que no nos importa la posición (el índice) en la que se encuentra el número, solo nos importa saber si "está" o "no está".
*   **Condicional `if`**: Es la pieza clave que realiza la comparación en cada paso del bucle.

---

### **Ejemplo4**

Este ejemplo introduce el concepto de **"zona útil"** o **"marcador de fin"** (centinela) en un array.

```java
public static void ejemplo4() {
    System.out.println("EJEMPLO 4");

    // Creamos el array con sus datos iniciales.
    int[] array = { 2, 4, 8, 12, 16, 18, 20, 10, 9 };

    // Establecemos un "centinela" o marcador. Aquí, el valor 0 indica el final
    // de la parte del array que nos interesa procesar. Sobrescribimos el valor 18.
    array[5] = 0;

    // Inicializamos un contador 'i' que usaremos como índice.
    int i = 0;

    // Usamos un bucle 'while' que se ejecuta mientras se cumplan DOS condiciones:
    // 1. Que el elemento en la posición 'i' NO sea 0 (nuestro centinela).
    // 2. Que el índice 'i' no se haya salido de los límites del array.
    while (array[i] != 0 && i < array.length) {
        // Si las condiciones se cumplen, imprimimos el elemento actual.
        System.out.print(array[i] + " ");
        // Incrementamos el índice para pasar al siguiente elemento en la próxima iteración.
        i++;
    }
    System.out.println(); // Salto de línea final.
}
```

**Explicación detallada:**

*   **Valor centinela**: A veces, un array puede tener un tamaño fijo grande, pero solo usamos una parte de él. En lugar de llevar una variable aparte que nos diga cuántos elementos "útiles" hay, podemos usar un valor especial (que no pueda aparecer en los datos normales, como `0` o `-1`) para marcar el final.
*   **Bucle `while`**: Es perfecto para esta tarea. Su condición de parada no es solo llegar al final del array (`i < array.length`), sino también encontrar el marcador (`array[i] != 0`). La segunda parte de la condición (`i < array.length`) es una medida de seguridad crucial para evitar un error `ArrayIndexOutOfBoundsException` si el centinela no estuviera en el array.

---

### **Ejemplo5**

Este último ejemplo se ocupa de los **arrays bidimensionales (matrices)**.

```java
public static void ejemplo5() {
    System.out.println("EJEMPLO 5");
    
    // Declaramos e inicializamos una matriz de 2x3 (2 filas, 3 columnas).
    int[][] matriz = {
            { 115, 12, 3 },  // Fila 0
            { 65, 23, 9 }   // Fila 1
    };

    // 1. RECORRER LA MATRIZ COMPLETA
    // Usamos dos bucles 'for' anidados. El exterior recorre las filas.
    // 'matriz.length' nos da el número de filas (en este caso, 2).
    for (int i = 0; i < matriz.length; i++) {
        // El bucle interior recorre las columnas de la fila actual.
        // 'matriz[i].length' nos da el número de columnas de la fila 'i' (en este caso, 3).
        for (int j = 0; j < matriz[i].length; j++) {
            // Imprimimos el elemento en la posición [fila][columna].
            System.out.print(matriz[i][j] + " ");
        }
        // Al terminar de imprimir una fila, hacemos un salto de línea.
        System.out.println();
    }
    System.out.println(); // Espacio extra.

    // 2. RECORRER UNA FILA ESPECÍFICA (la primera, índice 0)
    // Fijamos la fila en 0 y recorremos sus columnas.
    for (int i = 0; i < matriz[0].length; i++) {
        System.out.print(matriz[0][i] + " ");
    }
    System.out.println("\n"); // Dos saltos de línea.

    // 3. RECORRER UNA COLUMNA ESPECÍFICA (la primera, índice 0)
    // Fijamos la columna en 0 y recorremos las filas.
    for (int i = 0; i < matriz.length; i++) {
        System.out.println(matriz[i][0]+ " ");
    }
    System.out.println("\n"); // Dos saltos de línea.

    // 4. IMPRESIÓN DE LA MATRIZ CON UNA UTILIDAD
    // Para arrays multidimensionales, se usa 'Arrays.deepToString()'
    // que gestiona los arrays anidados y los muestra de forma legible.
    System.out.println(Arrays.deepToString(matriz));
}
```

**Explicación detallada:**

*   **Estructura de una Matriz**: Una matriz en Java es, en realidad, un "array de arrays". `matriz` es un array que contiene dos elementos. Cada uno de esos elementos es, a su vez, otro array de 3 enteros.
*   **Recorrido anidado**: La forma estándar de procesar cada elemento de una matriz es con un bucle anidado. El bucle exterior (con la variable `i`) selecciona la fila, y el bucle interior (con la variable `j`) recorre cada elemento (columna) de esa fila.
*   **Acceso a filas y columnas**: Se muestra cómo, jugando con los índices, podemos recorrer solo una fila (fijando `i` y variando `j`) o solo una columna (variando `i` y fijando `j`).
*   **`Arrays.deepToString()`**: Así como `Arrays.toString()` es para arrays de una dimensión, `deepToString()` es la herramienta correcta para visualizar arrays de dos o más dimensiones.

Espero que este análisis detallado te sea de gran utilidad para tus clases. ¡Un saludo o más dimensiones.

Espero que este análisis detallado te sea de gran utilidad para tus clases. ¡Un saludo

