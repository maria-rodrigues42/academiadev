package systemFunctions.Actions;

import Users.User;
import systemFunctions.MenuAction;
import systemFunctions.Tool;



public class Login extends Tool implements MenuAction {

    String emailLogin;
    boolean repetir = false;
    // se 1 login foi feito com sucesso
    // se 0 repetir ate o login ser realizado com sucesso


    @Override
    public void execute() {
        do{
            System.out.println("Digite seu email: ");
            emailLogin = leitorTerminal.nextLine();

            //buscando email para fazer login
            User usuarioLogado = usuarios.get(emailLogin);//atribuindo a consulta no map de usuarios para uma variavel auxiliar que indica o usuario que esta logado
            if(usuarioLogado == null){ //se ele nao foi encontrado no sistema
                repetir = true;
                System.out.println("Email nao encontrado, digite novamente.");
            }else {
                repetir = false;
                System.out.println("Voce esta logado como %s".formatted(usuarioLogado));
            }

        }while(this.repetir);

    }
}
