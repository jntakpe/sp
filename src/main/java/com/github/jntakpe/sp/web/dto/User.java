package com.github.jntakpe.sp.web.dto;

/**
 * Bean contenant les informations de l'utilisateur courant
 *
 * @author jntakpe
 */
public class User {

    private String login;

    private boolean isAdmin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
