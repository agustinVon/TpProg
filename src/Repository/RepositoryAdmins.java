package Repository;

import Users.Administrator;
import Users.Data;
import Users.Operators;

import java.util.HashMap;

public class RepositoryAdmins implements OperatorsRepositry{

    private HashMap<String, Administrator> admins;

    RepositoryAdmins(){
        admins=new HashMap<>();
    }

    public Administrator findAdmin(String name) {
        for (Administrator administrators : admins.values()) {
            if (administrators.getName().equals(name)) {
                return administrators;
            }
        }
        return null;

    }

    @Override
    public void add(Data data) {
        admins.put(data.getName(),new Administrator(data));
    }

    @Override
    public Operators find(Data data) {
        for (Administrator administrators : admins.values()) {
            if (administrators.getName().equals(data.getName())) {
                return administrators;
            }
        }
        return null;
    }

}
