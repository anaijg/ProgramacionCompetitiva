import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=427&cat=108">Yo soy tu...</a>
 */
public class P427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosDePrueba = sc.nextInt();
        sc.nextLine(); // para que no salte
        for (int i = 0; i < casosDePrueba; i++) {
            String palabra1 = sc.nextLine();
            String palabra2 = sc.nextLine();
            if (palabra1.equals("Luke") && palabra2.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(palabra1 + ", yo soy tu " + palabra2);
            }
        }
    }
}
