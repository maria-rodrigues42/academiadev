package systemFunctions;

import Courses.BasicPlan;
import Courses.CourseCatalog;
import Courses.PremiumPlan;
import Courses.SubscriptionPlan;
import Support.SupportTicket;
import Users.Student;
import Users.User;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import systemFunctions.Actions.Login;

public class MenuActionsList {
    public static Map<String, User> usuarios;
    public static CourseCatalog catalogo;
    public static Queue<SupportTicket> filaDeTicketSuporte;
    public static Scanner scanner;

    public static void inicializar(Map<String, User> usuariosMap, CourseCatalog cat, Queue<SupportTicket> fila, Scanner sc) {
        usuarios = usuariosMap;
        catalogo = cat;
        filaDeTicketSuporte = fila;
        scanner = sc;
    }

    public static void Login(String email) {
        Login loginAction = new Login();
        loginAction.execute(email, usuarios);
    }

    public static void CadastrarAluno(String nome, String email, String tipoPlano) {
        if (usuarios.containsKey(email)) {
            System.out.println("Já existe um usuário com esse email.");
            return;
        }
        SubscriptionPlan plano = tipoPlano.equalsIgnoreCase("premium") ? new PremiumPlan() : new BasicPlan();
        Student novo = new Student(nome, email, plano);
        usuarios.put(email, novo);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void AbrirTicket(String email, String titulo, String mensagem) {
        User user = usuarios.get(email);
        if (user == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }
        SupportTicket ticket = new SupportTicket(user, titulo, mensagem);
        filaDeTicketSuporte.add(ticket);
        System.out.println("Ticket aberto!");
    }

    public static void ListarCursos() {
        System.out.println("Cursos disponíveis:");
        catalogo.listarCursos();
    }

    public static void mostrarMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastrar Aluno");
        System.out.println("3 - Abrir Ticket");
        System.out.println("4 - Listar Cursos");
        System.out.println("0 - Sair");
    }
}
