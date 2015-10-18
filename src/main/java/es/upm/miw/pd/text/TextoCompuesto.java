package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoCompuesto extends Componente implements TextoCompuestoInterface {

    List<Componente> componentes;

    public TextoCompuesto(){
        this.componentes = new ArrayList<>();
    }
    
    public void delete(){
        if (this.componentes.size() > 0) {
            this.componentes.remove(this.componentes.size() - 1);
        }
    }
    
    public String dibujar(boolean toUpper) {
        String resultado = "";
        for (Componente componente : componentes) {
            resultado += componente.dibujar(toUpper);
        }
        return resultado;
    }
};
