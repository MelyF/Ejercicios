package sample;

public class Empleado extends Persona{

    private Double remuneracion;
    private int empleadoID;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoID = empleadoID;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    @Override
    public String toString() {
        return super.toString()+", " +"remuneracion=" + remuneracion +
                ", empleadoID=" + empleadoID ;
    }
    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }
}
