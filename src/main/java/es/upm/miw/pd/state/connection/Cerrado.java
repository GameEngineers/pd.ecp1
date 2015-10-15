package es.upm.miw.pd.state.connection;

public class Cerrado extends EstadoAbstracto {

    public Cerrado(){
        this.estado = Estado.CERRADO;
    }
   
    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }
}
