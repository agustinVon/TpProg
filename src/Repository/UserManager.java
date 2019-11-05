package Repository;

import Exeptions.UserIsNotRegistered;
import Users.Data;
import Users.PhoneNumber;
import Users.User;

public class UserManager {

    private final Repository<User> userRepo;

    public UserManager(Repository<User> userRepo){
        this.userRepo=userRepo;
    }

    public void add(User user){
        userRepo.add(user);
    }

    public User find(PhoneNumber aPhoneNumber)throws UserIsNotRegistered {
        for (User user:userRepo.get()) {
            if(user.getPhoneNumber().equals(aPhoneNumber)) return user;
        }
        throw new UserIsNotRegistered();
    }

    public Repository<User> getUserRepo() {
        return userRepo;
    }

    public void add(Data data) {
        userRepo.add(new User(data));
    }
}
