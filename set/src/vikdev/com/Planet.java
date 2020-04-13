package vikdev.com;

public class Planet extends HeavenlyBody {
    public Planet(String name,double orbitalPeriod){
        super(name,orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean adSatellite(HeavenlyBody moon) {
        if (moon.bodyTypes() == BodyTypes.MOON){
            return super.adSatellite(moon);
        }else {
            return false;
        }
    }
}
