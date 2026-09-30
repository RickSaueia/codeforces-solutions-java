package level_800;
import java.util.Scanner;


public class Bit282A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        int x = 0;

        for(int i = 0; i < qtd; i++){
            String instrucao = sc.next();

            if(instrucao.contains("+")){
                x++;
            } else if(instrucao.contains("-")){
                x--;
            }
        }
        System.out.println(x);

    }
}
