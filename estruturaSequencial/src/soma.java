import java.util.Scanner;

public class soma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
        int soma;



        A = scanner.nextInt();
        B = scanner.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}