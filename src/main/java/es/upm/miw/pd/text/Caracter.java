package es.upm.miw.pd.text;

public class Caracter extends Componente {

    String caracter;

    public Caracter(char caracter) {
        this.caracter = String.valueOf(caracter);
    }
    

    public void add(Componente componente){
        return;
    }


    @Override
    public String dibujar(boolean toUpper) {
        return (toUpper == true) ? caracter.toUpperCase() : caracter;
    }


    @Override
    public void despachar(TextoCompuestoInterface texto) {
        texto.atender(this);
    }

}
