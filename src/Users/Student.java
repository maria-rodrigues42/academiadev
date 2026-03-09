package Users;

import Courses.Course;
import Courses.Enrollment;
import Courses.SubscriptionPlan;

import java.util.ArrayList;
import java.util.Objects;

public class Student extends User{
    private ArrayList<Enrollment> listaDeMatriculasAtuais = new ArrayList<>();
    private SubscriptionPlan plano; //uma variavel que pode ser do tipo BasicPlan e PremiumPlan


    public Student(String name, String email, SubscriptionPlan plano){
        super(name, email); //parametros para criacao da classe pai
        this.plano = plano;


    }

    public void matricular(Course cursoDesejado){
        //verificando se algo esta dando errado e lancando exxecoes

        //plano permite a matricula
        if(!this.plano.podeSeInscrever(listaDeMatriculasAtuais)){
            throw new IllegalArgumentException("plano não permite mais matriculas");
        }

        //o curso esta ativo?
        if(!cursoDesejado.getStatus().equals("ACTIVE")){
            throw new IllegalArgumentException("O curso desejado não esta ativo");
        }

        //o aluno ja nao esta matriculado nesse curso?
        if(this.listaDeMatriculasAtuais.stream().anyMatch(matricula -> matricula.getCursoMatriculado().equals(cursoDesejado))){
            throw new IllegalArgumentException("O aluno já esta matriculado nesse curso");
        }

        //aqui passou por todas as veificacoes, so falta cadastrar
        Enrollment novaMatricula = new Enrollment(cursoDesejado, this);

        //adicionando a matricula nova aos cursos atuais do aluno
        this.listaDeMatriculasAtuais.add(novaMatricula);

    }



    //getters e setters
    public ArrayList<Enrollment> getListaDeMatriculasAtuais() {
        return listaDeMatriculasAtuais;
    }

    public void setListaDeMatriculasAtuais(ArrayList<Enrollment> listaDeMatriculasAtuais) {
        this.listaDeMatriculasAtuais = listaDeMatriculasAtuais;
    }

    public SubscriptionPlan getPlano() {
        return plano;
    }

    public void setPlano(SubscriptionPlan plano) {
        this.plano = plano;
    }
}
