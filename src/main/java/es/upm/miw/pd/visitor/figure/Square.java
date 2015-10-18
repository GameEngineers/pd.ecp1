package es.upm.miw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
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

    public double getSide() {
        return side;
    }

}
