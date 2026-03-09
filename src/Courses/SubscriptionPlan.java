package Courses;

import java.util.ArrayList;

public interface SubscriptionPlan {//plano de estudo (basico ou premium)


    public boolean podeSeInscrever(ArrayList<Enrollment> listaCursosMatriculados);

}
