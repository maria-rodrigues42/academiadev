package Users;
public class User {
    private String name;
    private String email;// deve ser unico

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public void setName( String nome){
        this.name = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}
