import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=429&cat=108">Organizando los hangares</a>
 */
public class P429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hacemos un do-while del que salimos cuando el número de hangares introducido es 0
        int H = 0;
        do {
            H = sc.nextInt();
            if ( H != 0) {
                sc.nextLine(); // para que no salte el siguiente nextLine()
                String lineaHangares = sc.nextLine(); // tamaño de los H hangares
                int N = sc.nextInt(); // cantidad de naves que llegan a la base
                sc.nextLine(); // para que no salte el siguiente nextLine()
                String lineaNaves = sc.nextLine(); // tamaños de las N naves que llegan

                // tenemos que convertir el String tamañosH en un array de enteros
                String[] th = lineaHangares.split(" ");
                int[] hangares = new int[H]; // creamos el array de tamaños de los hangares
                for (int i = 0; i < hangares.length; i++) { // lo rellenamos cogiéndolos del String lineaTamañosH
                    hangares[i] = Integer.valueOf(th[i]);
                }

                // lo mismo para los tamaños de las naves
                String[] tn = lineaNaves.split(" ");
                int[] naves = new int[N];
                for (int i = 0; i < naves.length; i++) {
                    naves[i] = Integer.valueOf(tn[i]);
                }

                // vamos cogiendo la primera nave que llega, la metemos en el hangar que tenga más espacio y actualizamos el espacio del hangar
                // flag para la respuesta final
                String cabe = "SI"; // empezamos suponiendo que caben; si alguna nave no podemos colocarla, cambiamos esto a false y salimos

                // para cada nave vemos si cabe en el mayor hangar
                for (int i = 0; i < naves.length; i++) {
                    // buscamos el hangar con más tamaño disponible (el mayor)
                    int mayor = 0;
                    int posicionMayor = 0; // no solo necesitamos saber cuál es el mayor; también en qué posición está
                    for (int j = 0; j < hangares.length; j++) {
                        if (hangares[j] > mayor) {
                            mayor = hangares[j];
                            posicionMayor = j;
                        }
                    }
                    // comprobamos si cabe la nave en ese hangar
                    if (naves[i] <= hangares[posicionMayor]) {
                        // si cabe, la metemos y actualizamos el tamaño del hangar que está en la posición
                        hangares[posicionMayor] = hangares[posicionMayor] - naves[i];
                        // y pasamos a la siguiente nave (siguiente iteración del for
                    } else {
                        // si la nave no cabe, ya no hay más que hacer, ponemos el flag a false y salimos
                        cabe = "NO";
                        break;
                    }
                }
                // resultado de revisar si caben las naves en los hangares para el caso de prueba que acabamos de procesar
                System.out.println(cabe);
            }
        } while (H != 0);
    }
}

