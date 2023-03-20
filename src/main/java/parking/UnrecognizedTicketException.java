package parking;

public class UnrecognizedTicketException extends RuntimeException {
    public UnrecognizedTicketException() {
        super("unrecognized ticket");
    }
}
