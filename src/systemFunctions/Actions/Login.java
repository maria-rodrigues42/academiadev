package systemFunctions.Actions;

import Users.User;
import systemFunctions.MenuAction;



public class Login implements MenuAction {

    public void execute(String email, java.util.Map<String, User> usuarios) {
        User usuarioLogado = usuarios.get(email);
        if(usuarioLogado == null){
            System.out.println("Email nao encontrado, digite novamente.");
        }else {
            System.out.println("Voce esta logado como %s".formatted(usuarioLogado));
        }
    }

    @Override
    public void execute() {
        // Método da interface MenuAction, não utilizado nessa implementação
    }
}
