package Vehicles;
import java.util.Scanner;

public class Road {
    private int fixedLength;
    private int fixedWidth;
    private Direction direction;

    private Array<Vehicle> vehicles;
}


public class Road {
    private int fixedLength;
    private int fixedWidth;
    private Direction direction;

    private Vehicle vehicle;
    private int vehPosition;
    array vehicles
    array postions 


    postions[0]


    public setVehicle (Vehicle veh){
        this.vehicle = veh;
        //init varaible
        this.vehPosition = 0;
    }

    public void simulateOne (){
        
        while this.vehPosition < this.fixedLength:
            this.vehPosition += this.vehicle.getSpeed()
        
        this.vehicle = null;
        this.vehPosition = 0;
    }

    public void simulateMany (){
        //while until no vehicle on road
        while ():
            //calculate new postions of each veh
            //factors: size, speed
            //

            draw (postions): - : draw road
                             * : draw vehicle, 
        
        this.vehicle = null;
        this.vehPosition = 0;
    }
}

public class Vehicles {
    Scanner scan = new Scanner(System.in);
    //todo enum type VEH {}
    private final String BRAND_NAME ;

    
    private int speed;
    
    private String color;
    
    public Vehicles(String BRAND_NAME, int speed, String color){
        this.BRAND_NAME = BRAND_NAME; //VEH.
        this.speed = speed;
        this.color = color;
        this.checkSpeed(); 
        
    }
    public void checkSpeed(){
        if(this.getSpeed() != 1 ||this.getSpeed() != 2 || this.getSpeed() != 4 ){
            System.out.println("your speed input is not valid, try again: ");
            int a = scan.nextInt();
            this.setSpeed(a);
        }
    } 
    public String getBRAND_NAME() {
        return BRAND_NAME;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed in [1,2,4]):
            this.speed = speed

        printf('error')
    }

    protected int size;
    public int getSize(){
        return this.size;
    }

}


Vehicles veh = new Bike();
veh.getSize ();
