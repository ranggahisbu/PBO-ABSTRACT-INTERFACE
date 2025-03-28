package AbstrackPackage;

public class Cube extends Shape3D {
    private float side;

    public Cube(float side) {
        this.side = side;
    }

    @Override
    float getVolume() {
        return side * side * side;
    }
}
