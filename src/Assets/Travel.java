package Assets;

import Users.Timer;

public class Travel {

    private final Asset asset;
    private final Timer timer;
    private final long expectedTime;

    public Travel(Asset asset, Timer timer, long expectedTime){
        this.asset=asset;
        this.timer= new Timer(System.nanoTime()); //TODO pasarle el tiempo que se creo desde que se corre la aplicacion
        this.expectedTime=expectedTime;
    }

    public Asset getAsset() {
        return asset;
    }

    public boolean checkTime(long actualTime){
        if(timer.actualTimePassSinceStartedTimer(actualTime)<=expectedTime) return true;
        else return false;
    }
}
