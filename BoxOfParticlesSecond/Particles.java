package BoxOfParticlesSecond;

import java.util.ArrayList;

public class Particles {
    private ArrayList<Particle> particles;

    public Particles(int number) {
        this.particles = new ArrayList<Particle>();
        this.genrateParticles(number);
    }

    public Particle get(int index) {
        if (index < this.particles.size()) {
            return this.particles.get(index);
        }

        return null;
    }

    public int size() {
        return this.particles.size();
    }

    private ArrayList<Particle> genrateParticles(int parNumber) {
        
        for (int a = 0; a < parNumber; a++) {
            Particle par = new Particle(Position.generatePos(), Position.generatePos());

            this.particles.add(par);

        }
        return this.particles;
    }

    public boolean findPoint(int x, int y) {
        boolean valid = false;
        for (int i = 0; i < this.particles.size(); i++) {
            Particle par = this.particles.get(i);
            if (par.getX() == x && par.getY() == y) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public void move(int x, int y, int width, int height) {
        for (int i = 0; i < this.particles.size(); i++) {
            Particle par = this.particles.get(i);
            par.move(x, y, width, height);
        }

        ArrayList<Particle> newParticles = new ArrayList<Particle>();
        for (int i = 0; i < this.particles.size() - 1; i++) {

            for (int j = i + 1; j < this.particles.size(); j++) {
                if (this.particles.get(i).isHit(this.particles.get(j))) {
                    if (this.particles.size() + newParticles.size() < width * height) {
                        Particle par = new Particle();
                        newParticles.add(par);
                    } else {
                        this.particles.addAll(newParticles);
                        return;
                    }

                }
            }

        }
        
        this.particles.addAll(newParticles);
    }

}
