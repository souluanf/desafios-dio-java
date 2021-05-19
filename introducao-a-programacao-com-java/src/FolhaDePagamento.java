import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        double v3 = sc.nextDouble();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", v1, v2 * v3);
    }
}