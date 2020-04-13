package wallChallange;

public class Wall {
    private double width,height;

    public Wall(){
        this(5 ,4);
    }
    public Wall(double width,double height){

        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }
        else
        this.width = width;
    }
    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }
        else
            this.height = height;
    }


    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public double getArea(){
        double area;
        area = this.height * this.width;
        return area;
    }

}
