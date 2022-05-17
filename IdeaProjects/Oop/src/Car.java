public class Car {
    // a class is a blueprint for an object

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("Carrera") || validModel.equals("commodore")){
        this.model = model;
        } else {
            this.model = "Unknow";
        }
    }

    public String getModel(){
        return this.model;
    }



}
