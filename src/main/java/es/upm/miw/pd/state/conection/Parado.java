package es.upm.miw.pd.state.conection;

public class Parado extends EstadoAbstracto {

    public Parado(){
        this.estado = Estado.PARADO;
    }
    @Override
    public void iniciar(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

}
