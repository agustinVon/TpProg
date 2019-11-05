package Users;

import Assets.*;
import Exeptions.UserIsAlreadyLockedExeption;
import Exeptions.UserIsNotInATripException;
import Points.PointsStoredInUserForEachZone;


public class User extends Operators{


    private final Data data;
    private boolean isLocked=false;
    PointsStoredInUserForEachZone points;

    Travel actualTravel=null;
    Asset assetUsed=null; //crear clase de viaje o sesion

    public User(Data data) {
        this.points=new PointsStoredInUserForEachZone();
        this.data =data;
    }

    public void userLocking(boolean lockUser) throws UserIsAlreadyLockedExeption {
            isLocked=lockUser;
    }

    public PhoneNumber getPhoneNumber(){
        return data.getPhoneNumber();
    }

    public String getName() {
        return data.getName();
    }

    public boolean getLock(){ //for testing
        return isLocked;
    }

    public void rentAsset(AssetParking assetParking, AssetType assetType,long expectedTime){
        Travel travel=new Travel(assetParking.rentAsset(assetType),new Timer(System.nanoTime()),expectedTime);
    }

    public double returnAsset(AssetParking assetParking)throws UserIsNotInATripException {
        if(actualTravel!=null){
            //boolean returnredAtRightTime=tripTimer.compareTime(ExpectedTime);
            double totalFee = assetParking.returnAsset(actualTravel,points.getPoints(assetParking.getZone()));
            points.add(assetParking.ganarPuntos(actualTravel,data,points.getPoints(assetParking.getZone())),assetParking.getZone());
            //TODO add points when asset is returned
            actualTravel=null;
            return  totalFee;
        }
        else{
            throw new UserIsNotInATripException();
        }
    }

}

