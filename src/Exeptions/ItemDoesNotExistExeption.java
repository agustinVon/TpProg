package Exeptions;

public class ItemDoesNotExistExeption extends Exception {

    public ItemDoesNotExistExeption() {
        super("El item que quiere eliminar no se encuentra en el repositorio");
    }
}

