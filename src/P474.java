import java.util.Scanner;

/**
 *  @see  <a href="https://www.aceptaelreto.com/problem/statement.php?id=362&cat=98">El día de Navidad</a>
 */
public class P474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String fecha = sc.nextLine();
            if (fecha.equals("25 12")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }


    }
}
