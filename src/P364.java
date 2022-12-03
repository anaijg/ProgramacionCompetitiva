import java.util.Scanner;

/**
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=364&cat=98">Espionaje en Navidad</a>
 */

public class P364 {
    public static void main(String[] args) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        String linea;
        do {
             linea = sc.nextLine();
            if (linea.equals("FIN")) {
                break;
            } else {
                String lineaEncriptada = "";
                for (int i = 0; i < linea.length(); i++){
                    // caso especial: transformamos la letra 'Z' por la 'A'
                    if ('Z' == linea.charAt(i)) {
                        lineaEncriptada = lineaEncriptada + 'A';
                    } else if (linea.charAt(i) == ' ') { // si es un espacio, dejamos el espacio tal cual
                        lineaEncriptada = lineaEncriptada + linea.charAt(i);
                    } else { // el resto de letras que va procesando el for las sustituimos por la siguiente
                        // buscamos la letra en abecedario, la reemplazamos y luego la añadimos a la línea
                        int indiceLetraAEncriptar = abecedario.indexOf(linea.charAt(i));
                        lineaEncriptada = lineaEncriptada + abecedario.charAt(indiceLetraAEncriptar+1);
                    }
                }
                System.out.println(lineaEncriptada);
            }
        }while (!linea.equals("FIN"));
    }
}


