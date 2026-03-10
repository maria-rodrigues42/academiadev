
import Courses.CourseCatalog;
import Support.SupportTicket;
import Users.User;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import systemFunctions.MenuActionsList;

public class Main {
    public static void main(String[] args) {
        CourseCatalog catalogo = new CourseCatalog();
        Map<String, User> usuarios = new HashMap<>();
        Queue<SupportTicket> filaDeTicketSuporte = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        InitialData.carregarDados(catalogo, usuarios);
        MenuActionsList.inicializar(usuarios, catalogo, filaDeTicketSuporte, scanner);

        int escolha;
        System.out.println("====== Academia Dev ======\n\n");
        do {
            MenuActionsList.mostrarMenu();
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch(escolha) {
                case 1:
                    System.out.print("Digite seu email: ");
                    MenuActionsList.Login(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Plano (basic/premium): ");
                    MenuActionsList.CadastrarAluno(nome, email, scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Email: ");
                    String emailTicket = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Mensagem: ");
                    MenuActionsList.AbrirTicket(emailTicket, titulo, scanner.nextLine());
                    break;
                case 4:
                    MenuActionsList.ListarCursos();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);
        scanner.close();
    }
}