package AbstrackPackage;

public class Cylinder extends Shape3D {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }
}
