import javax.swing.*;
import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=577&cat=143">Cucharadas de sopa</a>
 */
public class P577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int mafalda=0;
        int padre=0;
        int madre=0;

        System.out.println("ingrese el numero de cucharas: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mafalda= sc.nextInt();
            padre= sc.nextInt();
            madre= sc.nextInt();
            System.out.println(Math.min(madre - mafalda + 1, padre + 1));
        }
    }
}
