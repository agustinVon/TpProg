package Assets;

public class AssetType {

    private final Integer point;
    private final String name;

    public AssetType(Integer pointsPerMinute, String name){
        this.point=pointsPerMinute;
        this.name=name;
    }

    public Integer getPoint() {
        return point;
    }
}
