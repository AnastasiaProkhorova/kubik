public class Main {
    public static void main(String[] args){
        Cube cube = new Cube();
        cube.scale(100);
        cube.rotate(200, 200, 100);
        Viewer vidok = new Viewer(500, 500, cube);
    }
}
