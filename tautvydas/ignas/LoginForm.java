package com.tautvydas.ignas;

public class LoginForm {
    String emailOriginal;
    String passwordOriginal;

    public LoginForm(String email, String password) {
        this.emailOriginal = email;
        this.passwordOriginal = password;
    }

    public boolean login(String email, String password) {
        if (email.toLowerCase().equals(this.emailOriginal.toLowerCase()) &&
                password.toLowerCase().equals(this.passwordOriginal.toLowerCase())) {
            System.out.println("Sveikiname. Jūsų email ir password sutapo.");
            System.out.println("Jūs sėkmingai prisijugėte prie savo paskyros.");
            return true;
        }
        return false;
    }
}
