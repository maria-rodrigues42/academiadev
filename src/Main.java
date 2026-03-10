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

        //variaveis para controle do menu


        System.out.println("====== Academia Dev ======\n\n");
        do{


            //====LOGIN


            //======FIM DO LOGIN

        }while();







    }
}