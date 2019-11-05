package Exeptions;

public class AssetTypeDoesNotExistInSpecifiedZone extends Exception {
    public AssetTypeDoesNotExistInSpecifiedZone(){
        super("El tipo de asset selecionado no existe en la zona");
    }
}
