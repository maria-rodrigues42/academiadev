import Courses.BasicPlan;
import Courses.Course;
import Courses.CourseCatalog;
import Courses.PremiumPlan;
import Support.SupportTicket;
import Users.Admin;
import Users.User;
import Users.Student;

import java.time.Duration;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variaveis para guardar os dados do sistema: cursos e usuarios e os ticket de suporte
        CourseCatalog catalogo = new CourseCatalog();
        Map<String, User> usuarios = new HashMap<>();

        Queue<SupportTicket> filaDeTicketSuporte = new LinkedList<>(); // <> significa que so vai aceitar objetos daquela classe estrita na fila, Map, array, etc. blindagem

        BasicPlan planoBasico = new BasicPlan();
        PremiumPlan planoPremium = new PremiumPlan();

        Student carlos = new Student("Carlos", "carlos@email.com", planoBasico);
        Student ana = new Student("Ana", "ana@email.com", planoPremium);

        //colocando os dados iniciais
        InitialData.carregarDados(catalogo, usuarios);

        SupportTicket ticket = new SupportTicket(ana, "meu computador nao abre o curso", "estou com problemas para acessar o curso pelo computador");
        filaDeTicketSuporte.add(ticket);
        System.out.println(filaDeTicketSuporte.poll().getTitle());

        ticket = new SupportTicket(carlos, "meu celularnao abre o curso", "estou com problemas para acessar o curso pelo meu celular");
        filaDeTicketSuporte.add(ticket);
        System.out.println(filaDeTicketSuporte.poll().getTitle());

        //variaveis para controle do menu
        int escolhaNavegacaoMenu = 1;
        Scanner leitorTerminal = new Scanner(System.in);//le o terminal (input)
        String emailLogin;

        do{
            System.out.println("====== Academia Dev ======\n\n");
            //outro do while?
            System.out.println("Digite seu email: ");
            emailLogin = leitorTerminal.nextLine();

            //buscando email para fazer login
            User usuarioLogado = usuarios.get(emailLogin);//atribuindo a consulta no map de usuarios para uma variavel auxiliar que indica o usuario que esta logado
            if(usuarioLogado != null){ //se ele foi encontrado no sistema
                System.out.println("Email nao encontrado, digite novamente.");
            }
            //outro do while?
            System.out.println("Voce esta logado como %s".formatted());

        }while(escolhaNavegacaoMenu == 0);







    }
}