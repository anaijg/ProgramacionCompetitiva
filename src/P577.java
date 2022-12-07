import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=577&cat=143">Cucharadas de sopa</a>
 */
public class P577 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Lee el número de casos de prueba
        int n = scanner.nextInt();

        // Procesa cada caso de prueba
        for (int i = 0; i < n; i++) {
            // Lee los tres números que indican cuántas cucharadas dice Mafalda que se ha tomado como mínimo,
            // cuántas cucharadas dice el padre que se ha tomado como máximo, y cuántas cucharadas había puesto
            // realmente en el plato la madre.
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println( Math.min(c - a + 1, b + 1) );
        }
    }
}
