package Inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name,int size,int weight,int gills,int eyes,int fins){
        super(name,1,1,size,weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;

    }
    private void rest() {

    }
    private void moveMuscles(){
        System.out.println("dog.moveMuscles ");

    }
    private void moveBackFin(){
        System.out.println("dog.moveBackFin");
    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(20);
    }
}
