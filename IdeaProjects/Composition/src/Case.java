public class Case {

    private String model;
    private String manufacter;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacter, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacter = manufacter;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
