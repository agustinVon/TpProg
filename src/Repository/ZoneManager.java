package Repository;

import Assets.Zone;
import Exeptions.ZoneAlreadyExistsException;
import Points.PointTable;

public class ZoneManager {


    private final Repository<Zone> zones;

    ZoneManager(Repository<Zone> zones){
        this.zones=zones;
    }

    public void add(int zonePoints,String name, PointTable pointTable)throws ZoneAlreadyExistsException {
        for (Zone zone:zones.get()) {
            if(zone.getName().equals(name)){
                throw new ZoneAlreadyExistsException();
            }
        }
        zones.add(new Zone());
    }
}
