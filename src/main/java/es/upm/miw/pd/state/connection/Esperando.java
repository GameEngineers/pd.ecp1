package es.upm.miw.pd.state.connection;

public class Esperando extends EstadoAbstracto {

    public Esperando() {
        this.estado = Estado.ESPERANDO;
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setEstado(new Preparado());
        } else if (respuesta > 0) {
            conexion.setEstado(new Cerrado());
        }
    }
}
