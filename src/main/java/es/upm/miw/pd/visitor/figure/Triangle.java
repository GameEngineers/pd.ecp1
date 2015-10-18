package es.upm.miw.pd.visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(Visitor v) {
        return v.area(this);
    }

    @Override
    public double numberOfSides(Visitor v) {
        return v.numberOfSides(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

}
