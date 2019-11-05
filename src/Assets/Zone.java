package Assets;

import Exeptions.AssetTypeDoesNotExistInSpecifiedZone;
import Points.NameAndScore;
import Points.PointTable;
import Repository.RepositoryDiscount;
import Users.Data;

import java.util.ArrayList;

public class Zone {
    private final String name;

    private final ArrayList<AssetBatch> assetList=new ArrayList<AssetBatch>();
    private final ArrayList<Asset> totalAssets=new ArrayList<>();
    private final Tarifario tarifario=new Tarifario();
    private final PointTable pointTable;//create in construtor or leave it like that? implement after knowing persistance
    private PointCounter pointCounter;
    private RepositoryDiscount repositoryDiscount=new RepositoryDiscount();

    public Zone(String name,PointTable pointTable){

        this.name=name;
        this.pointTable=pointTable;
        this.pointCounter=new PointCounter();
    }

    public void addNewBach(AssetBatch assetBatch) {
        assetList.add(assetBatch);
        for (Asset asset: assetBatch.getAssetList()) {
            totalAssets.add(asset);
        }
    }

    public Asset getAssetwithDesignatedType(AssetType assetType) throws AssetTypeDoesNotExistInSpecifiedZone {
        for(AssetBatch batch : assetList){
            if(batch.getType() == assetType){
                for(Asset asset: batch.getAssetList()){
                    if(!asset.assetIsOcupied){
                        return asset;
                    }
                }
            }
        }
        throw new AssetTypeDoesNotExistInSpecifiedZone();
    }

    public double calculateFee(Asset assetUsed, int points) {
        return tarifario.calculatePrice(assetUsed,repositoryDiscount.find(assetUsed.getAssetType()),points);
    }

    public void addDiscount(Discount discount){
        repositoryDiscount.add(discount);
    }

    public ArrayList<Discount> showDiscounts(){
        return repositoryDiscount.showDiscounts();
    }

    public ArrayList<Asset> getTotalAssets() {
        return totalAssets;
    }

    public Integer actualizarPuntos(Travel actualTravel, Data data, Integer points) {
        Integer aquiredPoints=points+pointCounter.calculateAquiredPoints(actualTravel);
        pointTable.updateScore(aquiredPoints,data);
        return aquiredPoints;
    }

    /*
    public ArrayList<NameAndScore> getTop10Leaders(){
        //TODO return top 10Leaders
        //this method can be called from user
    }

    public void giveTopUsersMonthDiscount(){
        //TODO this method is called from admin
        //then it tells user to have a discount
        //user.givemonthDiscount()
        //this activates a boolean in user that determinates if he has a 50 discount in next purchase
    }
    */

    public String getName() {
        return name;
    }
}
