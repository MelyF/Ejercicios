import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {

    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProd;

    private static int ultimoIde=0;


    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return this.identificador=++ultimoIde;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        this.productos[indiceProd++] = producto;
    }

    int total = 0;

    public int calcularTotal() {
        for (Producto p : productos) {
            total += p.getPrecio();

        }
        return total;
    }
    String strDateFormat = "dd-MMM-yyyy";
    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);


    public String verDetalle() {
        String detalle = " Identificador: " + this.getIdentificador()+
                "\n Descripcion : " + this.getDescripcion() +
                "\n Fecha: "+ objSDF.format(fecha) +
                "\n Cliente = " + this.cliente.getNombreCliente() + "," + this.cliente.getApellido();

        detalle += "\n Productos: ";
        for (Producto prod : this.getProductos()) {
            detalle += "\n " + prod.getFabricante() + ", " + prod.getNombre() + ", " + prod.getPrecio();
        }
        detalle += "\n Precio Total = $" + this.calcularTotal();

        return detalle;
    }
}

