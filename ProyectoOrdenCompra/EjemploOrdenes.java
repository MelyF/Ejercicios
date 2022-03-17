import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {


        Date fecha = new Date();


        Cliente cliente1= new Cliente("Juana", "Perez");
        OrdenCompra orden1=new OrdenCompra("Despensa");
        orden1.setFecha(fecha);
        orden1.setCliente(cliente1);

        orden1.addProducto(new Producto("arcor", "alfajor", 25));
        orden1.addProducto( new Producto("Arcor", "mermelada", 82));
        orden1.addProducto(new Producto("Cremigal","yogur", 120));
        orden1.addProducto(new Producto("Terrabusi", "galletitas surtidas", 132));

        Cliente cliente2= new Cliente("Lujan", "Area");
        OrdenCompra orden2= new OrdenCompra("Despensa");
        orden2.setFecha(fecha);
        orden2.setCliente(cliente2);
        orden2.addProducto(new Producto("Natura", "mayonesa", 67));
        orden2.addProducto( new Producto("Arcor", "Sobre de jugo", 10));
        orden2.addProducto(new Producto("Sancor","leche", 136));
        orden2.addProducto(new Producto("Poe", "desodorante piso", 81));

        Cliente cliente3= new Cliente("Adrian", "Gonzales");
        OrdenCompra orden3= new OrdenCompra("Despensa");
        orden3.setFecha(fecha);
        orden3.setCliente(cliente3);
        orden3.addProducto(new Producto("Cocinero", "aceite", 94));
        orden3.addProducto( new Producto("Bagley", "galletitas", 136));
        orden3.addProducto(new Producto("Sancor","crema de leche", 102));
        orden3.addProducto(new Producto("Dove", "jabon de tocador", 85));

        Cliente cliente4= new Cliente("Ramiro", "lopez");
        OrdenCompra orden4= new OrdenCompra("Despensa");
        orden4.setFecha(fecha);
        orden4.setCliente(cliente4);
        orden4.addProducto(new Producto("Paladini", "paleta", 145));
        orden4.addProducto( new Producto("Arcor", "galletitas", 109));
        orden4.addProducto(new Producto("Campañola","tomate triturado", 136));
        orden4.addProducto(new Producto("Ariel", "jabon liquido", 81));

        System.out.println(orden1.verDetalle()+"\n");
        System.out.println(orden2.verDetalle()+"\n");
        System.out.println(orden3.verDetalle()+"\n");
        System.out.println(orden4.verDetalle());

        

    }
}
