import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=532&cat=125">Reduciendo envases</a>
 */
public class P532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosDePrueba = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < casosDePrueba; i++) {
            String linea = sc.nextLine();
            String[] array = linea.split(" ");
            int N = Integer.parseInt(array[0]);
            int T = Integer.parseInt(array[1]);
            int envase = T - N;
            System.out.println(envase);
        }
    }
}
