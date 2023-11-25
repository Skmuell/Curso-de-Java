import java.util.Locale;
import java.util.Scanner;

public class salario {
    public salario() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();
        double salario = valorHora * (double)horas;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        scanner.close();
    }
}