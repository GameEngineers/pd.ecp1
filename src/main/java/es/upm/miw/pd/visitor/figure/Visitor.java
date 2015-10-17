package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {
    
    public abstract double area(Circle circle);
    public abstract double area(Square square);
    public abstract double area(Triangle triangle);
    
    public abstract double numberOfSides(Circle circle);
    public abstract double numberOfSides(Square square);
    public abstract double numberOfSides(Triangle triangle);
}
