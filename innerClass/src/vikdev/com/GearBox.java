package vikdev.com;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears = new ArrayList<Gear>();
    private int maxGear;
    private int currentGear = 0;
    private boolean clutch;

    public GearBox(int maxGear){
        this.maxGear = maxGear;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutch = in;
    }

    public void addGear(int number,double ratio){
        if((number >0) && (number <= maxGear)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear >=0) && (newGear < this.gears.size()) && this.clutch){
                this.currentGear = newGear;
                System.out.println("Gear "+newGear+" selected");
        }else{
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }


    public double wheelSpeed(int revs){
        if (clutch){
            System.out.println("Scream!");
            return 0.0;
        }else
            return revs * gears.get(currentGear).getRatio();
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber,double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }

}
