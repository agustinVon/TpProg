package Repository;

import Assets.AssetType;
import Assets.Discount;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositoryDiscount {

    HashMap<AssetType, Discount> discounts;
    ArrayList<AssetType> assetTypesInRepository;

    public RepositoryDiscount(){
        discounts=new HashMap<>();
        assetTypesInRepository=new ArrayList<>();
    }

    public void add(Discount discount){
        discounts.put(discount.getAssetType(),discount);
        assetTypesInRepository.add(discount.getAssetType());
    }

    public Discount find(AssetType assetType){
        return discounts.get(assetType);
    }

    public ArrayList<Discount> showDiscounts(){
        ArrayList<Discount> discountsToShow=new ArrayList<>();
        for (AssetType assetType:assetTypesInRepository) {
            discountsToShow.add(discounts.get(assetType));
        }
        return discountsToShow;
    }
}
