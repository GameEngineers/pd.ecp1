package es.upm.miw.pd.text;

import java.util.*;

public class FactoriaCaracter {

    private Map<String, Caracter> caracteres = new HashMap<>();

    private static final FactoriaCaracter SINGLETON = new FactoriaCaracter();

    private FactoriaCaracter() {
    }

    public static FactoriaCaracter getFactoria() {
        return SINGLETON;
    }

    public Caracter get(char caracter) {
        String car = String.valueOf(caracter);
        if (caracteres.containsKey(car)) {
            return caracteres.get(car);
        } else {
            Caracter c = new Caracter(caracter);
            caracteres.put(car, c);
            return c;
        }
    }
}
