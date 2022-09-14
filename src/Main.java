/*
Accessor methods: give read/write capabilities outside of the class
    -aka getters and setters
        getters: read/write attributes
        setters: update attributes
    -will be in class with the private attribute

    Each private attribute needs its own setter/getter methods to read or update outside of the class.
    attributes cannot be accessed outside of the class without the getter/setter methods.

-no keyword for non static
'static' is a reserved keyword
static: attribute is shared among all objects of the same class (can be changed)
    - if you change a static attribute for one object, you change for all objects

    -aka class attributes/methods

static methods:
    -don't have access to non-static resources
    -aka class methods
    -non static methods CAN use static resources
'final' variables cannoot be reassigned.
 */


public class Main {
    public static void main(String[] args) {
        Weird w = new Weird(1);
        System.out.println(w.getA());

        w.setA(10);
        System.out.println(w.getA());

        Circle c0 = new Circle (1);

            System.out.println(c0.getArea());

        c0.setRadius(10);
            System.out.println(c0.getRadius());
            System.out.println(c0.getArea());

            //for static attributes/methods : can call upon the class itself, dont have to use an object to
    }
}
