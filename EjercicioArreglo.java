import java.util.Scanner;

public class EjercicioArreglo {

    public static void main(String[] args) {

        Integer[] numero= new Integer[10];
        Integer[] segundo= new Integer[numero.length];


        Scanner teclado= new Scanner(System.in);

        for (int i=0; i<= numero.length- 1;i++){
            System.out.print("Ingrese un numero: ");
                numero[i]=teclado.nextInt();
        }
        Integer[] a= numero.clone();
        int aux=0;
        for(int i=numero.length-1; i>=0; i--){
            segundo[aux++]=numero[i];
        }

        int j=0;
        for(int k=0; k<=4; k++){
        numero[j++]=segundo[k];
        numero[j++]=a[k];
        }
        System.out.println(" ");
        for (int i=0; i<=numero.length-1; i++){
            System.out.println(" " + numero[i]);
        }
    }

}
