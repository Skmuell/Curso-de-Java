import java.util.Scanner;

public class diferenca {
    public diferenca() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int dif = A * B - C * D;
        System.out.println("DIFERENÇA = " + dif);
        scanner.close();
    }
}