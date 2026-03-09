import Courses.Course;
import Courses.CourseCatalog;
import Courses.BasicPlan;
import Courses.PremiumPlan;
import Users.Student;
import Users.User;
import java.time.Duration;
import java.util.Map;

public class InitialData {

    public static void carregarDados(CourseCatalog catalogo, Map<String, User> usuariosSistema)
    //passa como parametro o acatalogo onde vao l=ficar a lista de todos os cursos e um dicionario para armazenar os usuarios
    {

        // 1. Criando os Cursos de amostragem
        Course c1 = new Course("Java Foundations", "Curso básico de Java", "Prof. Isaque", Duration.ofHours(10), "BEGINNER", "ACTIVE");
        Course c2 = new Course("Spring Boot na Prática", "Desenvolvimento web com Spring", "Profa. Maria", Duration.ofHours(15), "INTERMEDIATE", "ACTIVE");
        Course c3 = new Course("Arquitetura de Microsserviços", "Escale suas aplicações", "Prof. Isaque", Duration.ofHours(20), "ADVANCED", "ACTIVE");
        Course c4 = new Course("Lógica de Programação", "Passos iniciais", "Prof. Alan", Duration.ofHours(5), "BEGINNER", "INACTIVE");
        Course c5 = new Course("Mensageria com Kafka", "Comunicação assíncrona", "Profa. Maria", Duration.ofHours(12), "ADVANCED", "ACTIVE");

        // Guardando os cursos no Catálogo que veio do Main
        catalogo.adicionarCurso(c1);
        catalogo.adicionarCurso(c2);
        catalogo.adicionarCurso(c3);
        catalogo.adicionarCurso(c4);
        catalogo.adicionarCurso(c5);

        // 2. Instanciando os Planos de Assinatura
        BasicPlan planoBasico = new BasicPlan();
        PremiumPlan planoPremium = new PremiumPlan();

        // 3. Criando os Alunos do desafio
        Student carlos = new Student("Carlos", "carlos@email.com", planoBasico);
        Student ana = new Student("Ana", "ana@email.com", planoPremium);

        // Guardando os usuários no Mapa (Dicionário) do Main. A chave é o email!
        usuariosSistema.put(carlos.getEmail(), carlos);
        usuariosSistema.put(ana.getEmail(), ana);

        System.out.println("dados iniciais carregados.");
    }
}