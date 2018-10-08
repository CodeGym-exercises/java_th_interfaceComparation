public class Circle {
    private double radius;
    private String name;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
