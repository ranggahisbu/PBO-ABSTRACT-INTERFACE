package AbstrackPackage;

public class Main {
    public static void main(String[] args) {
        Shape3D bola = new Sphere(10);
        Shape3D kubus = new Cube(8);
        Shape3D tabung = new Cylinder(5, 15);

        System.out.println("Volume Bola : " + bola);
        System.out.println("Volume Kubus : " + kubus);
        System.out.println("Volume Tabung : " + tabung);
    }
}
