import java.util.Scanner;

/**
 *  @see  <a href="https://www.aceptaelreto.com/problem/statement.php?id=428&cat=108">Tendencia al lado oscuro</a>
 */
public class P428 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // leemos el número de casos de prueba
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int base10 = sc.nextInt();
            String base5AlReves = "";
            // lo convertimos en base 5
            int cociente = base10, resto = 0;
            do {
                resto = cociente % 5;
                base5AlReves = base5AlReves + String.valueOf(resto);
                cociente = cociente / 5;
            } while (cociente > 5);
            // cuando termina el bucle de las divisiones, añadimos el último cociente
            base5AlReves = base5AlReves + String.valueOf(cociente);
            //System.out.println(base5AlReves);
            // revertiríamos base5AlReves para tener el número en base 5, pero en realidad da igual
            // porque lo único que necesitamos ahora es contar los 4
            int contadorDe4 = 0;
            for (int j = 0; j < base5AlReves.length(); j++) {
                if (base5AlReves.charAt(j) == '4') {
                    contadorDe4++;
                }
            }
            // si el contador es mayor que 1, contestamos sí
            if (contadorDe4 > 1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
