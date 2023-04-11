package Vehicles;

import java.util.ArrayList;

enum Direction{
    WEST_TO_EAST
}
public class Road {
    private int length;
    private int width;
    
    
    public Road(int length, int width){
        this.length = length;
        this.width = width;

    }
    ArrayList<Vehicles> vehicle = new ArrayList<>();
    
    
    
    public int getWidtd() {
        return width;
    }
    public int getLength() {
        return length;
    }
}
