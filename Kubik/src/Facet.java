public class Facet {
    private Vector[] vertex = new Vector[4];
    public Facet(Vector v1,Vector v2,Vector v3,Vector v4){
        this.vertex[0] = v1;
        this.vertex[1] = v2;
        this.vertex[2] = v3;
        this.vertex[3] = v4;
    }
    public Facet(){
        System.out.println("Ошибка ввода");
    }
    public static void print(Facet x){
        for(int i=0;i<x.vertex.length;i++){
            Vector.returning(x.vertex[i]);
        }
    }
    public static void rotate(){

    }
}
