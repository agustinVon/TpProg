package Exeptions;

public class ZoneDoesNotExistException extends Exception {
    public ZoneDoesNotExistException(){
        super("Zone does not exist");
    }
}
