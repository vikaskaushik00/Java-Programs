package vikdev.com;

import java.util.HashSet;
import java.util.Set;

public  class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyTypes;
    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name ,double orbitalPeriod,BodyTypes bodyTypes){
        this.name = name;
        this.orbitalPeriod =  orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyTypes = bodyTypes;

    }


    
    public String getName(){
        return name;
    }
    public BodyTypes bodyTypes(){
        return bodyTypes;
    }
    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public boolean adSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof HeavenlyBody){
            HeavenlyBody object = ((HeavenlyBody)obj);
            if (this.name.equals(object.getName())){
                return this.bodyTypes == object.bodyTypes();
            }
        }
     return false;

    }

    public int hashCode(){
       // System.out.println("hash code called");
        return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
    }

    @Override
    public String toString(){
        return this.name+" : "+this.bodyTypes+" -> "+this.orbitalPeriod;
    }

}
