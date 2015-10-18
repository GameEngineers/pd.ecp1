package es.upm.miw.pd.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

    @Override
    public double area(Visitor v) {
        return v.area(this);
    }

    @Override
    public double numberOfSides(Visitor v) {
        return v.numberOfSides(this);
    }

    public double getRadius() {
        return radius;
    }
}
