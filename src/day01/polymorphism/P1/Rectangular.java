package day01.polymorphism.P1;

public class Rectangular extends Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

    @Override
    public void calculationArea() {
        setArea(width*height);
    }
}
