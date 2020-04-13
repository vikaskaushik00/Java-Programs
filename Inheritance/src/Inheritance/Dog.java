package Inheritance;

public class Dog extends Animal {
        private int eyes;
        private int teeth;
        private int tail;
        private int legs;
        private String  coat;

    public Dog(String name,int brain,int size,int weight,int eyes,int teeth,int tail,int legs,String coat){
            super(name, brain, 1, size,weight);
            this.eyes = eyes;
            this.teeth = teeth;
            this.tail = tail;
            this.legs = legs;
            this.coat = coat;
    }

        public int getEyes(){
        return this.eyes;
        }
        public int getTeeth(){
        return this.teeth;
        }
        public int getTail(){
        return this.tail;
      }
       public int getLegs(){
        return this.legs;
       }
       public String getCoat(){
        return this.coat;
       }
       public void chew(){
        System.out.println("Chewing");
       }

       public void eat(){
        chew();
        super.eat();
       }

       public void walk(){
        System.out.println("dog.walk");
        super.move(5);
       }
       public void run(){
        System.out.println("dog.run");
        super.move(10);
       }
       public void movingLegs(int speed){
        System.out.println("movingLegs "+speed);
       }
       public void move(int speed){
        movingLegs(4);
        System.out.println("dog.move");
       }
}
