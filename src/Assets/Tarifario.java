package Assets;

import Exeptions.CantApplyDiscountExeption;

public class Tarifario {

    public double calculatePrice(Asset assetUsed, Discount discount, int points) {
        try {
            return discount.applyDiscount(assetUsed.getAssetType(), points, assetUsed.getPrice());
        } catch (CantApplyDiscountExeption cantApplyDiscountExeption) {
            //Avisar que no se pudo aplicar descuento
            return assetUsed.getPrice();
        }
    }
}