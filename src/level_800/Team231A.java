package level_800;
import java.util.Scanner;


public class Team231A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int problemas = sc.nextInt();
        int i;
        int problemasResolvidos = 0;
        for(i = 0; i < problemas; i++){

            int petya =  sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            int sabemSolucao = petya +  vasya +  tonya;

            if(sabemSolucao >= 2 ){
                problemasResolvidos++;
            }
        }

        System.out.println(problemasResolvidos);
    }
}
