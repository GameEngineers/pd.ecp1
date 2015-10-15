package es.upm.miw.pd.state.connection;

public class Preparado extends EstadoAbstracto {

    public Preparado(){
        this.estado = Estado.PREPARADO;
    }
 
    @Override
    public void iniciar(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setEstado(new Preparado());
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setEstado(new Esperando());
        
    }
    
    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

}
