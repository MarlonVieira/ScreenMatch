package br.com.alura.screenmatch.Exceptions;

public class yearException extends RuntimeException {
    private String message;

    public yearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
