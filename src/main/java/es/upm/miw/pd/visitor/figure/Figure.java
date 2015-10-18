package es.upm.miw.pd.visitor.figure;

public abstract class Figure implements FigureInterface {
    
    public Figure(String description) {
    }
    
    public abstract double area(Visitor v);
    public abstract double numberOfSides(Visitor v);

}
