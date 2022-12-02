import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=364&cat=98">Espionaje en Navidad</a>
 */

        //Los Reyes Magos han detectado que Papá Noel tiene renos espía para averiguar qué han pedido los niños a los Reyes Magos y traerles él antes el regalo.

        // Para contrarestarlo, los Reyes Magos, que son grandes sabios de Oriente, han pedido a sus niños que envíen las cartas encriptadas. Para facilitarles la tarea, te han encargado hacer un programa que los pequeños puedan usar para encriptar sus cartas.

        // El mecanismo de encriptación es sencillo; al fin y al cabo los renos no son muy inteligentes y casi cualquier cosa será suficiente para que no entiendan nada. Consistirá en desplazar cada letra una posición en el alfabeto hacia delante. Por ejemplo, allí donde haya una letra A se pondrá una B, donde haya una letra B se pondrá una C… y donde haya una letra Z se pondrá una A.

        // Como queremos que el programa sirva para niños que están todavía aprendiendo a leer y a escribir, sólo tendrá que admitir letras mayúsculas y espacios, que se quedarán sin ningún cambio.



       // El programa deberá leer múltiples casos de prueba, cada uno compuesto por una línea de no más de 100 caracteres.

        //Las líneas contendrán únicamente letras del alfabeto inglés en mayúsculas, por lo que no contendrá ni la letra Ñ ni vocales con tilde. También podrán aparecer espacios (aunque no al principio ni al final), y no habrá ningún otro símbolo de puntuación.

        //La entrada terminará con una línea con, exactamente, el texto "FIN", que no deberá procesarse.

public class P364 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C','D', 'E', 'F','G', 'H', 'I', 'J', 'Z',};

        Scanner sc = new Scanner(System.in);
        String linea ="JAVIER";
        String transf_linea = "";

        while (!linea.equals("FIN")) {
            linea = sc.nextLine().toUpperCase();
            if (linea.length() > 100) {
                System.out.println("Error");
            }
            for (int i=0; i<linea.length(); i++){
                int j = 0;
                if ('Z' == linea.charAt(i)) {
                    transf_linea = transf_linea + abc[0];
                    break;
                }

                while ((j < abc.length) && ('Z' != linea.charAt(i))) {
                    if (abc[j] == linea.charAt(i))
                    {
                        transf_linea = transf_linea + abc[j+1];
                        break;
                    }
                    j++;
                }
            }
            System.out.println(transf_linea);
        }


    }
}
//if (x.length() >= 0 && x.length() <= 100) {
//    System.out.println(x);
//} else {
//    System.out.println("Error");
//}