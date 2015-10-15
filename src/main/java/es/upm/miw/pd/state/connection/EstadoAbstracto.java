package es.upm.miw.pd.state.connection;

public abstract class EstadoAbstracto {

    protected Estado estado;

    public void abrir(Conexion conexion) {
        this.lanzarOperacionNoPermitida();
    }

    public void cerrar(Conexion conexion) {
        this.lanzarOperacionNoPermitida();
    }

    public void parar(Conexion conexion) {
        this.lanzarOperacionNoPermitida();
    }

    public void iniciar(Conexion conexion) {
        this.lanzarOperacionNoPermitida();
    }

    public void enviar(Conexion conexion, String msg) {
        this.lanzarOperacionNoPermitida();
    }

    public void recibir(Conexion conexion, int respuesta) {
        this.lanzarOperacionNoPermitida();
    }

    public Estado getEstado() {
        return estado;
    }

    private void lanzarOperacionNoPermitida() {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
