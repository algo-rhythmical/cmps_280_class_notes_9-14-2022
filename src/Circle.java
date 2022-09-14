public class Circle {
    private double radius;
    public static double pi = 3.14;

    Circle (double radius) {
        if (radius > 0) {
            this.radius = radius;

        }
        else
            this.radius = 1.0;

    }

    //getter
    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        if (radius > 0) {
            this.radius = radius;

        }
    }

    //circumference = 2 * π * radius
    public double getCircumference() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    //static method example
    public static void methodA() {

    }

}
