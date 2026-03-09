package Support;

import Users.User;

public class SupportTicket {
    private User usuarioSolicitante;
    private String title;
    private String message;

    public SupportTicket(User usuarioSolicitante, String title, String message){
        this.usuarioSolicitante = usuarioSolicitante;
        this.title = title;
        this.message = message;
    }

    public User getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(User usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
