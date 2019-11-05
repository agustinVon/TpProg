package Points;

import Assets.Zone;

import java.util.HashMap;


public class PointsStoredInUserForEachZone{

    HashMap<Zone,Integer> pointsStored;


    public void add(Integer points, Zone zone){
        if(pointsStored.containsKey(zone)){
            pointsStored.put(zone,pointsStored.get(zone)+points);
        }
        else{
            pointsStored.put(zone,points);
        }
    }

    public Integer getPoints(Zone zone){
        return pointsStored.get(zone);
    }
}
