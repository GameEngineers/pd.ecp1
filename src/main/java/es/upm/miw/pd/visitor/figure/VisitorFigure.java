package es.upm.miw.pd.visitor.figure;

public class VisitorFigure extends Visitor {

    @Override
    public double area(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double area(Square square) {
        return square.getSide() * square.getSide();
    }

    @Override
    public double area(Triangle triangle) {
        return triangle.getBase() * triangle.getHeight() * 0.5;
    }

    @Override
    public double numberOfSides(Circle circle) {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double numberOfSides(Square square) {
        return 4;
    }

    @Override
    public double numberOfSides(Triangle triangle) {
        return 3;
    }

}
