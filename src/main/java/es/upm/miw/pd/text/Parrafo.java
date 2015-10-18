package es.upm.miw.pd.text;

public class Parrafo extends TextoCompuesto {

    public Parrafo() {
        super();
    }

    @Override
    public void add(Componente componente) {
        componente.despachar(this);

    }

    @Override
    public void atender(Caracter caracter) {
        this.componentes.add(caracter);
        
    }

    @Override
    public void atender(Parrafo parrafo) {
        throw new UnsupportedOperationException();
        
    }

    @Override
    public void atender(Texto texto) {
        throw new UnsupportedOperationException();
        
    }

    @Override
    public void despachar(TextoCompuestoInterface texto) {
        texto.atender(this);
    }
    
    public String dibujar(boolean toUpper){
        return super.dibujar(toUpper) + "\n";
    }
    

}
