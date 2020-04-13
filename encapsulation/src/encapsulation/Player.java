package encapsulation;

public class Player {
    private String fullName;
    private int health = 100;
    private String weapon;

    public Player(String fullName, int health, String weapon){
        this.fullName = fullName;
        if(health >0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player has been knocked out");
        }
        else
        System.out.println("Player health is : "+this.health);
    }

    public int getHealth(){
        return this.health;
    }
}
