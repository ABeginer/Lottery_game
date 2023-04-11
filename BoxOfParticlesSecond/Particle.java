package BoxOfParticlesSecond;

import java.util.Random;


public class Particle extends Position {
    
    public Particle(int x, int y) {
        super(x, y);

    }

    public Particle(){
        super();
    }


    private enum direction {
        north,
        northeast,
        east,
        south,
        southeast,
        southwest,
        west,
        northwest,
    }

    private direction randomDirection() {
        int pick = new Random().nextInt(direction.values().length);
        return direction.values()[pick];
    }


    public boolean isHit (Particle par){
        if (this.getX() == par.getX() && this.getY() == par.getY())
            return true;
        
        return false;
    }

    public void move( int x, int y, int width, int height) { 
        direction d = randomDirection();
        int xChange = 0, yChange = 0;
        switch (d) {
            case north:
                yChange--;

                break;
            case northeast:
                xChange++;
                yChange--;

                break;
            case east:
                xChange++;
                break;
            case south:
                ;
                yChange++;
                break;
            case southeast:
                xChange++;
                yChange++;
                break;
            case southwest:
                xChange--;
                yChange++;
                break;
            case west:
                yChange--;
                break;
            case northwest:
                xChange--;
                yChange--;
                break;
            default:
        }
        this.x += xChange;
        this.y += yChange;

        if (this.x < x) this.x = x;
        if (this.x > width) this.x = width;
        if (this.y < y) this.y = y;
        if (this.y > height) this.y = height;
    }
  
}
