package AbstrackPackage;

public abstract class Shape3D {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    abstract float getVolume();

    @Override
    public String toString() {
        return String.valueOf(getVolume());
    }
}
