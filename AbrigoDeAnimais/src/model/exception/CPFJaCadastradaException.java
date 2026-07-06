package model.exception;

public class CPFJaCadastradaException extends Exception {
    public CPFJaCadastradaException(String message) {
        super("CPF já cadastrado: " + message);
    }
}
