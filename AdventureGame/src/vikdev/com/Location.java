package vikdev.com;

import java.util.Map;
import java.util.HashMap;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID,String description,Map <String,Integer> exits){
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String,Integer>(exits);
        this.exits.put("Q",0);
    }
//
//    public void adExit(String direction,int location){
//        exits.put(direction,location);
//    }

    public int getLocationID(){
        return locationID;
    }
    public String getDescription(){
        return description;
    }

    public HashMap<String,Integer> getExit(){
        return new HashMap<>(exits);
    }

}
