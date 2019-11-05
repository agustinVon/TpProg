package Repository;

import Exeptions.UserIsNotRegistered;
import Users.Administrator;
import Users.Data;

public class AdminManager {

    private final Repository<Administrator> adminRepository;

    AdminManager(Repository<Administrator>adminRepository){
        this.adminRepository=adminRepository;
    }

    public void add(Data data){
        adminRepository.add(new Administrator(data));
    }

    public Administrator find(String name) throws UserIsNotRegistered {
        for (Administrator administrator:adminRepository.get()) {
            if(administrator.getName().equals(administrator)) return administrator;
        }
        throw new UserIsNotRegistered();
    }
}
