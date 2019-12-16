import java.awt.*;

public class Cube {
    private Facet[] facets;
    public Cube() {
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0 ,0), new R3Vector(1, 1,0), new R3Vector(0, 1, 0), Color.green);
        facets[1] = new Facet(new R3Vector(1, 0, 0), new R3Vector(1, 0 ,1), new R3Vector(1, 1,1), new R3Vector(1, 1, 0), Color.black);
        facets[2] = new Facet(new R3Vector(1, 0, 1), new R3Vector(1, 0 ,0), new R3Vector(0, 0,0), new R3Vector(0, 0, 1), Color.orange);
        facets[3] = new Facet(new R3Vector(0, 0, 0), new R3Vector(0, 1 ,0), new R3Vector(0, 1,1), new R3Vector(0, 0, 1), Color.magenta);
        facets[4] = new Facet(new R3Vector(0, 1, 0), new R3Vector(1, 1 ,0), new R3Vector(1, 1,1), new R3Vector(0, 1, 1), Color.pink);
        facets[5] = new Facet(new R3Vector(0, 1, 1), new R3Vector(1, 1 ,1), new R3Vector(1, 0,1), new R3Vector(0, 0, 1), Color.yellow);

    }

    public void rotate(double ux, double uy, double uz){
        for(int i=0; i<6; i++){
            facets[i].rotate(ux, uy, uz);
        }
    }
    public void scale(double k){
        for(int i=0; i<6; i++){
            facets[i].scale(k);
        }
    }
    public void translate(double x, double y, double z){
        for (int i=0; i<6; i++){
            facets[i].translate(x,y,z);
        }
    }
    public void draw(Graphics2D g){
        for(int i=0; i<6; i++){
            if (i == 0) {
                g.setColor(Color.pink);
            }
            if (i == 1) {
                g.setColor(Color.YELLOW);
            }
            if (i == 2) {
                g.setColor(Color.CYAN);
            }
            if (i == 3) {
                g.setColor(Color.MAGENTA);
            }
            if (i == 4) {
                g.setColor(Color.ORANGE);
            }
            if (i == 5) {
                g.setColor(Color.GREEN);
            }
            facets[i].draw(g);
        }
    }
}