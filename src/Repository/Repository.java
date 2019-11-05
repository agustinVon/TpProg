package Repository;

import Exeptions.ElementExistExeption;
import Exeptions.ItemDoesNotExistExeption;

import java.util.ArrayList;

public class Repository<T> {

    ArrayList<T> arrayListGeneric;

    Repository(){
    }


    public void add(T t) throws ElementExistExeption {
        if(arrayListGeneric.contains(t)){
            throw
        }
        arrayListGeneric.add(t);
    }

    public ArrayList<T> get(){
        return arrayListGeneric;
    }

    public void remove(T t)throws ItemDoesNotExistExeption {
        if(arrayListGeneric.contains(t)) arrayListGeneric.remove(t);
        else throw new ItemDoesNotExistExeption();
    }
}
