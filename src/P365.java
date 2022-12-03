import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=365&cat=98">En la cola de Papá Noel</a>
 */
public class P365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosDePrueba = sc.nextInt();
        for (int i = 0; i < casosDePrueba; i++) {
            int n = sc.nextInt(); // niños en la cola
            int a = sc.nextInt(); // posición de Aitor
            sc.nextLine(); // para que no nos salte cuando vayamos a leer un String después de leer un int
            String lineaRegalos = sc.nextLine(); // regalos que quiere pedir cada niño
            // los metemos en un array
            String[] regalosString = lineaRegalos.split(" ");
            // convertimos el array de String en un array de enteros
            int[] regalos = new int[regalosString.length];
            for (int j = 0; j < regalosString.length; j++) {
                regalos[j] = Integer.valueOf(regalosString[j]);
            }

            // calcular los minutos que tiene que esperar
            int minutos = 0;
            for (int k = 0; k < regalos.length; k++) { // cada k es un niño que está en la cola; el hermano de Aitor está en k = a -1
                    // por cada niño que tenemos delante, multiplicamos sus regalos por 2 minutos
                    if (k <= a - 1) {
                        if (regalos[k] <= regalos[a -1]) {
                            minutos = minutos + regalos[k] * 2;
                        } else {
                            minutos = minutos + regalos[a - 1] * 2;
                        }
                    } else { // los niños que tenemos detrás: solo tendremos que esperar hasta los regalos que tenga el hermano de Aitor, si tienen más nos da igual porque nos habremos ido
                        if (regalos[k] < regalos[a - 1]) {
                            minutos = minutos + regalos[k] * 2;
                        } else if (regalos[k] == regalos[a - 1]) {
                            minutos = minutos + (regalos[k] - 1) * 2;
                        } else {
                            minutos = minutos + (regalos[a - 1] - 1) * 2;
                        }
                    }
            }
            System.out.println(minutos);
        }
    }
}
