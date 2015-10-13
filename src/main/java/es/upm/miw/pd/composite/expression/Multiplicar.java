package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Expresion  {

    private Expresion exp1;

    private Expresion exp2;

    public Multiplicar(Expresion exp1, Expresion exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int operar() {
        return exp1.operar() * exp2.operar();
    }

    @Override
    public String toString() {
        return "(" + exp1.toString() + "*" + exp2.toString() + ")";
    }
}
