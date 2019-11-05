package Assets;

import Exeptions.AssetTypeDoesNotExistInSpecifiedZone;
import Users.Data;

public class AssetParking {

    private final Zone zone;

    AssetParking(Zone zone){
        this.zone=zone;
    }

    public Asset rentAsset(AssetType assetType) {
        Asset assetToOccupy=null;
        try{
            assetToOccupy=zone.getAssetwithDesignatedType(assetType);
        } catch (AssetTypeDoesNotExistInSpecifiedZone assetTypeDoesNotExistInSpecifiedZone) {
            assetTypeDoesNotExistInSpecifiedZone.printStackTrace();
            //TODO throw toast to inform that asset does not exist
        }
        return assetToOccupy;
    }

    public double returnAsset(Travel travel, int points) {
        return zone.calculateFee(travel.getAsset(),points);
    }

    public Integer ganarPuntos(Travel actualTravel, Data data, Integer points) {
        return zone.actualizarPuntos(actualTravel,data,points);
    }

    public Zone getZone() {
        return zone;
    }
}
