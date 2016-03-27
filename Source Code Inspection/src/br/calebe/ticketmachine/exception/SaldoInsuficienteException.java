package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar a compra");
    }

    public SaldoInsuficienteException(String message, Throwable throwable) {
        super(message, throwable);
    }  
}
