package Repository;

import Users.Data;
import Users.Operators;

public interface OperatorsRepositry {

    public void add(Data data);

    public Operators find(Data data);
}
