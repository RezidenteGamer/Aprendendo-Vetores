import java.util.Scanner;

public class LeituraDeNomesPeloUsuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nomes[] = {"", "", ""};

        System.out.println("Insira 3 nomes");
        System.out.println("Primeiro: ");
        nomes[0] = scanner.nextLine();
        System.out.println("Segundo: ");
        nomes[1] = scanner.nextLine();
        System.out.println("Terceiro: ");
        nomes[2] = scanner.nextLine();

        System.out.println("O primeiro nome inserido foi: " + nomes[0]);
        System.out.println("O segundo nome inserido foi: " + nomes[1]);
        System.out.println("O terceiro nome inserido foi: " + nomes[2]);
    }
}
