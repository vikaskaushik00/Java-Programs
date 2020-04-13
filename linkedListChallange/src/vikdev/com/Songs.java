package vikdev.com;

public class Songs {
    private String name;
    private double duration;

    public Songs(String name, double duration){
        this.name = name;
        this.duration = duration;
    }
    public String getName(){
        return this.name;
    }
    public double getDuration(){
        return this.duration;
    }

    public String toString(){
        return this.name+" : "+this.duration;
    }

}
