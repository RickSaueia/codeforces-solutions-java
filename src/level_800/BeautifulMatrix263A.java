package level_800;
import java.util.Scanner;

public class BeautifulMatrix263A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int movimentos = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                int valor = sc.nextInt();
                if (valor == 1) {
                    movimentos = Math.abs(i - 2) + Math.abs(j - 2);

                    //O math.abs foi essencial por tratar numeros negativos como numeros positivos e manter numeros positivos intactos.
                }
            }
        }

        System.out.println(movimentos);
    }
}
