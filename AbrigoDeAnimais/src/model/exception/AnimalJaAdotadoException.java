package model.exception;

public class AnimalJaAdotadoException extends RuntimeException {
    public AnimalJaAdotadoException(String nome) {
        super(nome + " já foi adotado!");
    }

}
