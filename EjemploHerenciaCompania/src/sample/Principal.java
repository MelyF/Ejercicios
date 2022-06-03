package sample;

public class Principal {

    public static void main(String[] args) {

        Gerente gerente= new Gerente("Juan", "Perez", "123654",
                "25 de mayo 125",60000.00,23,2000000.00);

        gerente.aumentarRemuneracion(20);
        gerente.setPresupuesto(25000000.00);
        System.out.println(gerente);
    }
}
