import java.util.Scanner;

public class soma {
    public soma() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int soma = A + B;
        System.out.println("SOMA = " + soma);
        scanner.close();
    }
}