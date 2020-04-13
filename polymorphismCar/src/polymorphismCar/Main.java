package polymorphismCar;

 class Car{
     private boolean engine;
     private int cylinder;
     private int wheels;
     public Car(boolean engine,int cylinder,int wheels){
         this.engine = engine;
         this.cylinder = cylinder;
         this.wheels = wheels;
     }

     public int getCylinder(){
         return this.cylinder;
     }
     public int getWheels(){
         return this.wheels;
     }
     public String name(){
         return "car name not available";
     }
     public String startEngine(){
         return "The engine is off ";
     }
     public String accelerate(){
        return "The car is not accelerating ";
     }
     public String brake(){
         return  "The brake are  applying right now ";
     }

}

class Nexon extends Car{
     public Nexon(){
         super(true,4,4);
     }

    @Override
    public String name(){
        return "Nexon";
    }

     @Override
     public String startEngine(){
         return "The engine is ON" ;
     }
     @Override
    public String accelerate(){
        return "The car is accelerating 70kmph ";
    }
    @Override
    public String brake(){
        return  "The brake are not applying right now ";
    }

}

class Hector extends Car{
    public Hector(){
        super(true,4,4);
    }


    @Override
    public String name(){
        return "Hector";
    }
    @Override
    public String startEngine(){
        return "The engine is off";
    }
    @Override
    public String accelerate(){
        return "The car is not accelerating ";
    }

}



class Seltos extends Car{
    public Seltos(){
        super(true,4,4);
    }

    @Override
    public String name(){
        return "Seltos";
    }

    @Override
    public String startEngine(){
        return "The engine is ON";
    }
    @Override
    public String accelerate(){
        return "The car is accelerating 90kmph ";
    }
    @Override
    public String brake(){
        return  "The brake are not applying right now ";
    }
}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i< 10; i++){
            Car car = randomCar();
            System.out.println("Car #"+i+"\n"+
                                "Name : "+car.name()+"\n"+
                                car.startEngine()+"\n"+
                                car.accelerate()+"\n"+
                                car.brake()+"\n");

        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated is "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Nexon();
            case 2:
                return new Hector();
            case 3:
                return new Seltos();
        }
        return null;
    }
}
