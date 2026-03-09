package Courses;

import java.util.ArrayList;

public class BasicPlan implements SubscriptionPlan {

    @Override
    public boolean podeSeInscrever(ArrayList<Enrollment> listaCursosMatriculados){
        //limite de cursos maximo atingido
        return listaCursosMatriculados.size() <= 2;
        //se 2 ou menos true
        //se 3 false
    }


}
