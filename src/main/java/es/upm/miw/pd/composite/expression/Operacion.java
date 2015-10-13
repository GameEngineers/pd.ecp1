package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion {

    protected Expresion exp1;

    protected Expresion exp2;

    public Operacion(Expresion exp1, Expresion exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    public String toString(){
        return "(" + exp1.toString() + this.operacionString() + this.exp2.toString() + ")";
    }
    
    protected abstract String operacionString();

}
