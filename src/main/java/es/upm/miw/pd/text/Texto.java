package es.upm.miw.pd.text;

public class Texto extends TextoCompuesto {

    public Texto() {
        super();
    }

    public void add(Componente componente) {
        componente.despachar(this);
    }

    @Override
    public String dibujar(boolean toUpper) {
        return super.dibujar(toUpper) + "---o---\n";
    }

    @Override
    public void atender(Caracter caracter) {
        throw new UnsupportedOperationException();
        
    }

    @Override
    public void atender(Parrafo parrafo) {
        this.componentes.add(parrafo);
        
    }

    @Override
    public void atender(Texto texto) {
        this.componentes.add(texto);
        
    }

    @Override
    public void despachar(TextoCompuestoInterface texto) {
        texto.atender(this);
    }

}
