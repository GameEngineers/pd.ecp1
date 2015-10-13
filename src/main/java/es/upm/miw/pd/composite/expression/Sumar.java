package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion {

    public Sumar(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {
        return exp1.operar() + exp2.operar();
    }

    @Override
    protected String operacionString() {
        return "+";
    }

}
