public class Wall {

    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double w, double h){
        this.width = w;
        this.height = h;

        if (w < 0){
            width = 0;
        }

        if (h < 0){
            height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        this.width = w;
        if (w < 0){
            width = 0;
        }
    }

    public void setHeight(double h) {
        this.height = h;
        if (h < 0){
            height = 0;
        }
    }

    public double getArea(){
        return width * height;
    }
}
