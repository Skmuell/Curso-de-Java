import java.util.Scanner;

public class funcoesIniciais {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga três números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a,b,c);

        mostrarResultado(maior);

        scanner.close();
    }

    public static int max(int x, int y,int z){
        int auxiliar;
        if(x > y && x > z){
            auxiliar = x;
        } else if (y > z) {
            auxiliar = y;
        }
        else {
            auxiliar = z;
        }

        return auxiliar;
    }

    public static void mostrarResultado(int valor){
        System.out.println("Maior = " + valor);
    }

}
