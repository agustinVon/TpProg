package Users;


public class Timer {

    private long startTime;

    public Timer(long startTime){
        this.startTime=startTime;
    }
    public long actualTimePassSinceStartedTimer(final long actualTime){
        return actualTime-startTime;
    }
    /*public boolean compareTime(Integer expectedTime) {

    }*/

    //TODO implement methods


}
