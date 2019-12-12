import java.util.Scanner;
class Vector {

    private double x, y, z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void plus(Vector b){
        Vector d = new Vector(x+b.x, y+b.y, z+b.z);
        System.out.println(d.x+" "+d.y+" "+d.z);
    }
    public void minus( Vector b){
        Vector f = new Vector(x-b.x, y-b.y, z+b.z);
        System.out.println(f.x+" "+f.y+" "+f.z);
    }
    public void mult(double k){
        Vector o = new Vector(k*x, k*y, k*z);
        System.out.println(o.x+" "+o.y+" "+o.z);
    }
    public void product(Vector b){
        double n = x*b.x + y*b.y + z*b.z;
        System.out.println(n);
    }
    public void mixed(Vector b, Vector c){
        double l = x*b.y*c.z + y*b.z*c.x + z*b.x*c.y-z*b.y*c.x-y*b.x*c.z-x*b.z*c.y;
        System.out.println(l);
    }
    //Поворачивает вектор относительно оси Х
    public void rotateOX(double u) {
        double unY = y;
        y = y*Math.cos(Math.toRadians(u))+z*Math.sin(Math.toRadians(u));
        z = -(unY*Math.sin(Math.toRadians(u))+z*Math.cos(Math.toRadians(u)));
    }
    //Поворачивает вектор относительно оси У
    public void rotateOY(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))+z*Math.sin(Math.toRadians(u));
        z = -(unX*Math.sin(Math.toRadians(u))+z*Math.cos(Math.toRadians(u)));
    }
    //Поворачивает вектор относительно оси Z
    public void rotateOZ(double u) {
        double unX = x;
        x = x*Math.cos(Math.toRadians(u))-y*Math.sin(Math.toRadians(u));
        y = -(unX*Math.sin(Math.toRadians(u))+y*Math.cos(Math.toRadians(u)));
    }
    public void rotate(double uX, double uY, double uZ){
        rotateOX(uX);
        rotateOY(uY);
        rotateOZ(uZ);
    }
    public static void returning(Vector A){
        System.out.println("("+A.x+" "+A.y+" "+A.z+")");
    }
}
