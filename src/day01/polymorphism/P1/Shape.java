package day01.polymorphism.P1;

public abstract class Shape {
    protected double area;    //#area : double
    private String name;      //-name : String

    public Shape(){}
    public Shape(String name){  //Shape 생성자를 오버로딩
        this.name = name;
    }

    public abstract void calculationArea();
    void print(){}

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
