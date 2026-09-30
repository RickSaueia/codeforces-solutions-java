package level_800;
import java.util.Scanner;

public class DominoPilling50A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int totalDominos = (m *  n) /  2;

        System.out.println(totalDominos);
    }


}
