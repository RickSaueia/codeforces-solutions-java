package level_800;
import java.util.Scanner;

public class NextRound158A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int participantes = sc.nextInt();
        int posicaoK = sc.nextInt();



        int[] pontuacoes = new int[participantes];



        for(int i = 0; i < participantes; i++){
            pontuacoes[i] = sc.nextInt();
        }

        int notaCorte = pontuacoes[posicaoK - 1];
        int classificados = 0;

        for(int i = 0; i < participantes; i++){
            if(pontuacoes[i] >= notaCorte && pontuacoes[i] > 0 ){
                classificados ++;
            }
        }

        System.out.println(classificados);

    }
}
