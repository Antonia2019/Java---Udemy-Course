public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(4.2,2);
        System.out.println("Radius = " + cylinder.getRadius());
        System.out.println("Height of cylinder = " + cylinder.getHeight());
        System.out.println("Area " + cylinder.getArea());
        System.out.println("Volume = " + cylinder.getVolume());
    }
}
