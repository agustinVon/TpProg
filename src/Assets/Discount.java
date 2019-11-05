package Assets;

import Exeptions.CantApplyDiscountExeption;

public class Discount {

    private final AssetType assetType;
    private final int minimumPoints;
    private final double percentageMultiplier;

    Discount(AssetType assetType, int minimumPoints, double discountPercentage){
        this.assetType=assetType;
        this.minimumPoints=minimumPoints;
        this.percentageMultiplier=discountPercentage/100;
    }

    public double applyDiscount(AssetType assetType,int points,double fee)throws CantApplyDiscountExeption {
        if(assetType.equals(this.assetType)&&points>=minimumPoints){
            return fee*percentageMultiplier;
        }
        else{
            throw new CantApplyDiscountExeption();
        }

    }

    public AssetType getAssetType() {
        return assetType;
    }
}
