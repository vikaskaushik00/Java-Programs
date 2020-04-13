package Inheritance;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Tuffy",1,1,8,20);
        animal.getBody();

        System.out.println(animal.getName());
        Dog obj = new Dog("Dog",2,1,15,2,20,1,4,"Silky");
        obj.eat();
        System.out.println("Dog has : "+obj.getBrain()+" brain");
        System.out.println(animal.getBrain());
        obj.eat();
        obj.walk();
        obj.run();
        obj.move(15);
        Fish fish = new Fish("kori",3,3,2,2,1);
        fish.swim(5);

    }
}
