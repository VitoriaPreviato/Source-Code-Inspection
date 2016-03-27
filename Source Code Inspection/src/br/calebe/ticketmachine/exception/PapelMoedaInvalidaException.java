package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    public PapelMoedaInvalidaException() {
        super("A nota inserida não é válida");
    }

    public PapelMoedaInvalidaException(String message, Throwable throwable) {
        super(message, throwable);
    }    
}
