import java.util.Scanner;

public class enquanto {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        while (x !=0){
            x = scanner.nextInt();
        }

        scanner.close();
    }


}
