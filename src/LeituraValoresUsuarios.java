import java.util.Scanner;

public class LeituraValoresUsuarios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valor[] = {0, 0, 0};

        System.out.println("Insira 3 valores");
        System.out.println("Primeiro: ");
        valor[0] = scanner.nextDouble();
        System.out.println("Segundo: ");
        valor[1] = scanner.nextDouble();
        System.out.println("Terceiro: ");
        valor[2] = scanner.nextDouble();

        System.out.println("O primeiro valor inserido foi: " + valor[0]);
        System.out.println("O segundo valor inserido foi: " + valor[1]);
        System.out.println("O terceiro valor inserido foi: " + valor[2]);
    }
}
