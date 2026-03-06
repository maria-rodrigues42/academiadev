package Courses;

import java.util.ArrayList;

public class SubscriptionPlan {//plano de estudo (basico ou premium)
    ArrayList<Course> listaCursosMatriculadosAtual = new() ArrayList<>;

    public boolean podeSeInscrever( ArrayList<Course> listaCursosMatriculadosAtual){
        if(planoPremium){
            return true;
        }else{
            if(planobasico){
                if (listaCursosMatriculadosAtual.size() > 3){
                    return false;
                }else{
                    return true;
                }
            }
        }

        
    }
}
