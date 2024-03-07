package swed.it.academy.project;

public class UnknownShapeException extends Exception {

    private final String message;

    public UnknownShapeException(String msg) {
        this.message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
