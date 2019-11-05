import Repository.*;
import Users.PhoneNumber;
import Users.*;
import UserManager;

public class Mooveme {

    private static Repository<User> userRepo;
    private static UserManager userMananger=new UserManager(userRepo);

    private static RepositoryAdmins repositoryAdmins;
    private static Operators activeuser;

    public Mooveme(UserManager userMananger, AdminManager adminMananger){
        Mooveme.userMananger = userMananger;
        Mooveme.repositoryAdmins=repositoryAdmins;
    }

    public static void register(String name, PhoneNumber phoneNumber){
        userMananger.add(new Data(name,phoneNumber));
    }

/*
    public static void login(PhoneNumber phoneNumber) {

        if(repositoryUser.testing(phoneNumber)){
            activeuser=repositoryUser.findUser(phoneNumber);
        }
        //usuario no registrado
    }

    public static void loginAdmin(String name){
        if(repositoryAdmins.testing(name)){
            activeuser=repositoryAdmins.findAdmin(name);
        }
        //admin no registrado
    }

 */
}
