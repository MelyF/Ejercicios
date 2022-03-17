public class Cliente {

    private String nombreCliente;
    private String apellido;

    public Cliente(String nombreCliente, String apellido) {
        this.nombreCliente = nombreCliente;
        this.apellido = apellido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellido() {
        return apellido;
    }
}
