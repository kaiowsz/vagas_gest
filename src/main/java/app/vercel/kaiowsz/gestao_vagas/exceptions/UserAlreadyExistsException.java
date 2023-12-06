package app.vercel.kaiowsz.gestao_vagas.exceptions;


public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {
        super("Usuário já existe.");
    }

}