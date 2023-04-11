package BoxOfParticlesSecond;



public class Box {
    private final int X = 1, Y = 1, WIDTH = 19, HEIGHT = 19;
    private Particles particles;
    public Box(int particleNumber){
        this.particles = new Particles(particleNumber);
    }

    public void drawBox() throws InterruptedException {
        for (int timeDraw = 0; timeDraw < 10000; timeDraw++) {
            System.out.printf("current particle numbers: %d\n\n", this.particles.size());
            this.particles.move(X, Y, WIDTH, HEIGHT);
            for (int x = 0; x <= 20; x++) {

                if (x == 0 || x == 20) {
                    for (int a = 1; a <= 20; a++) {
                        System.out.print("_ ");
                    }
                    System.out.println();

                } else {

                    for (int y = 0; y <= 20; y++) {
                        if (y == 0 || y == 20) {
                            System.out.print("|");

                        } else {
                            boolean matched = this.particles.findPoint(x, y);

                            if (matched) {
                                System.out.print(" *");
                            }

                            else {
                                System.out.print("  ");
                            }

                        }
                    }
                    System.out.println();
                }
            }
            Thread.sleep(100);
            System.out.print("\033[H\033[2J");
            
           ;
        }
    }
}
