import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite os dados X do triangulo : ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Digite os dados Y do triangulo");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n",areaY);

        if(areaX > areaY){
            System.out.println("Area maior: X");
        }
        else {
            System.out.println("Area maior : Y");
        }

        scanner.close();
    }
}
