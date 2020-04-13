package carpetCost;

public class Floor {
   private double width ,length;

    public Floor(double width,double length){
            setWidth(width);
            setLength(length);
    }
    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }
        else
            this.width = width;
    }
    public void setLength(double length){
        if(length < 0){
            this.length = 0;
        }
        else
            this.length = length;
    }
    public double getArea(){
        double area = this.width * this.length;
        return area;
    }
}
