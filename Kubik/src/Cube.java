import java.util.Vector;

public class Cube {
    private Facet[] facets;
    public Cube() {
     facets = Facet[6];
     facets[0] = new Facet(new Vector(0,0,0), new Vector(1,0,0), new Vector(1,1,0),new Vector(0,1,0));
     facets[1] = new Facet(new Vector(0,0,1), new Vector(1,0,1), new Vector(1,1,1),new Vector(0,1,1));
     facets[2] = new Facet(new Vector(0,0,0), new Vector(0,0,1), new Vector(1,0,1),new Vector(1,0,0));
     facets[3] = new Facet(new Vector(0,1,0), new Vector(0,1,1), new Vector(1,1,1),new Vector(1,1,0));
     facets[4] = new Facet(new Vector(0,1,0), new Vector(0,1,1), new Vector(0,0,1),new Vector(0,0,0));
     facets[5] = new Facet(new Vector(1,1,0), new Vector(1,1,1), new Vector(1,0,1),new Vector(1,0,0));
    }
}
