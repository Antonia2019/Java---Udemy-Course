public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Width = " + rectangle.getWidth());
        System.out.println("Length = " + rectangle.getLength());
        System.out.println("Area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println(" ");
        System.out.println("Width = " + cuboid.getWidth());
        System.out.println("Length = " + cuboid.getLength());
        System.out.println("Area = " + cuboid.getArea());
        System.out.println("Height = " + cuboid.getHeight());
        System.out.println("Volume = " + cuboid.getVolume());
    }
}
