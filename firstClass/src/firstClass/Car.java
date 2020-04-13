package firstClass;

public class Car {
    private int tyre;
    private int seat;
    private String model;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setTyre(int tyre) {
        this.tyre = tyre;
    }
    public int getTyre(){
        return this.tyre;
    }
    public void setSeat(int seat)
    {
        this.seat = seat;
    }
    public int getSeat(){
         return this.seat;
    }
    public void setColour(String colour){
        this.colour= colour;
    }
    public String getColour(){
        return this.colour;
    }

}
