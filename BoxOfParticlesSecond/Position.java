package BoxOfParticlesSecond;

public class Position {
    protected int x, y;

    public Position(){
        this.x = Position.generatePos();
        this.y = Position.generatePos();
    } 

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static int generatePos() {
        int a = (int) (Math.random() * (19) + 1);
        return a;
    }
}
