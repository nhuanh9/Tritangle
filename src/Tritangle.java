public class Tritangle extends Shape {
    private String color = "black";

    public Tritangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }
    public Tritangle(){

    }

    public double getPerimeter() {
        return super.getSide1() + super.getSide2() + super.getSide3();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +"\nTam giác màu: "+this.color+ "\nTam giác có chu vi là: " + this.getPerimeter();
    }
}
