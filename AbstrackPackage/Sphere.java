package AbstrackPackage;

public class Sphere extends Shape3D {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    float getVolume() {
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}
