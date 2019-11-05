package Exeptions;

public class UserIsNotRegistered extends Exception {

    public UserIsNotRegistered(){
        super("User is not registered");
    }
}
