import java.util.Scanner;

public class MenuDev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Criar Usuário");
            System.out.println("2 - Login");
            System.out.println("3 - Listar Usuários");
            System.out.println("4 -  Buscar Usuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha a opção de sua preferência: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Em manutenção");
            }
            else if (opcao == 2) {
                System.out.println("Em manutenção");
            }
            else if (opcao == 3) {
                System.out.println("Em manutenção");
            }
            else if (opcao == 4) {
                System.out.println("Em manutenção");
            }
            else if (opcao == 5) {
                System.out.println("Saindo...");
            }
        }
    }
}
