import java.lang.reflect.Array;
import java.util.Scanner;

public class EjercicioImprimirNumeroMasAlto {
    public static void main(String[] args) {

        Integer[] numero= new Integer[7];

        Scanner teclado= new Scanner(System.in);

        //Ingresamos los datos al arreglo
        for (int i=0; i<=numero.length-1; i++){
            System.out.print("Ingrese un numero: ");
            numero[i]= teclado.nextInt();
        }

        int mayor=0;
        //Obtenemos el mayor valor
        for(int i=0; i<=numero.length-1; i++){
        if (numero[i]> mayor){
            mayor= numero[i];
        }
        }
        System.out.println("El numero mas alto del arreglo es: " + mayor);
    }
}
