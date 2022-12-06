import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=535&cat=125">Desembalse</a>
 */

public class P535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = 0;
        String linea = "";
        do {
            D = sc.nextInt(); sc.nextLine();
            if (D != 0) {
                linea = sc.nextLine();
                String[] array = linea.split(" ");
                int[] alturas = new int[D];
                for (int i = 0; i < array.length; i++) {
                    alturas[i] = Integer.parseInt(array[i]);
                }
                // este problema se entiende mejor haciendo un dibujo
                // encontrar la altura mayor
                int mayor = 0;
                for (int i = 0; i < alturas.length; i++) {
                    if (alturas[i] > mayor) {
                        mayor = alturas[i];
                    }
                }
                // restamos la altura menor a todas las demás
                // y vamos sumando las alturas
                int suma = 0;
                for (int i = 0; i < alturas.length; i++) {
                    suma = suma + (mayor - alturas[i]);
                }
                // finalmente, mostramos la suma, que es lo que nos piden
                System.out.println(suma);
            }
        } while (D != 0);
    }
}
