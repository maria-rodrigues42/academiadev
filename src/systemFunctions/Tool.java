package systemFunctions;

//essa classe tera todas as variaveis e importacaoes que serao usadas nas MenuAction(cada acao singular do menu)

import Courses.CourseCatalog;
import Users.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tool {
    public Scanner leitorTerminal = new Scanner(System.in);
    public Integer escolhaNavegacaoMenu = 1;
    public CourseCatalog catalogo = new CourseCatalog();
    public Map<String, User> usuarios = new HashMap<>();

}
