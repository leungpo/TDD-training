package parking;

public class FullParkingException extends RuntimeException{
    public FullParkingException() {
        super("Full parking lot");
    }
}
