package Assets;

public class PointCounter {


    public int calculateAquiredPoints(Travel travel){
        if(travel.checkTime(System.nanoTime())){
            return (int) (travel.getAsset().getAssetType().getPoint()*1.2);
        }
        else return travel.getAsset().getAssetType().getPoint();
    }
}
