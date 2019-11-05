package Exeptions;

public class CantApplyDiscountExeption extends Exception {
    public CantApplyDiscountExeption(){
        super("El descuento no es aplicable");
    }
}
