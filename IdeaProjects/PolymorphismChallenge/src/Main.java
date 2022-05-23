class Car {

    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car => startEngine()";
    }

    public String accelerate(){
        return "Car => accelerate()";
    }

    public String brake(){ //frana
        return "Car => brake()";
    }
}

public class Main{
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Main.Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Honda honda = new Honda(6,"Honda WD3");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

    }

    static class Honda extends Car{
        public Honda(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " => startEngine()";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " => accelerate()";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " => brake()";
        }
    }

    static class Ford extends Car{

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford => startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford => accelerate()";
        }

        @Override
        public String brake() {
            return "Ford => brake()";
        }
    }

    static class Mitsubishi extends Car{
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi => startEngine()";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi => accelerate()";
        }

        @Override
        public String brake() {
            return "Mitsubishi => brake()";
        }
    }
}

