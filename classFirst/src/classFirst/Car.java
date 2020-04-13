package classFirst;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        model = model.toLowerCase();
        if(model.equals("nexon") || model.equals("harrier")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
