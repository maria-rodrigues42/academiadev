package Courses;

import java.util.ArrayList;

public class PremiumPlan implements SubscriptionPlan {

    @Override
    public boolean podeSeInscrever(ArrayList<Enrollment> listaCursosMatriculados) {
        return true;
        //plano premium pode se inscrever em cursos ilimitados
    }


}
