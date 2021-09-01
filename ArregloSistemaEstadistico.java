import java.util.Scanner;

public class ArregloSistemaEstadistico {

    public static void main(String[] args) {

        Integer[] numeros = new Integer[7];

        Scanner teclado = new Scanner(System.in);

        //Ingresamos los datos al arreglo
        for (int i=0; i<=numeros.length-1; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i]= teclado.nextInt();
        }

        float sumaPos=0, sumaNeg=0;
        int cantPos=0, cantNeg=0, cantCeros=0;
        //Calculamos la suma de positivos, negativos y ceros
        for(int i=0; i<=numeros.length-1; i++){
            if(numeros[i] == 0){
                cantCeros++;

            } else if(numeros[i] < 0){
                sumaNeg= sumaNeg + numeros[i];
                cantNeg++;
            } else{
                sumaPos= sumaPos + numeros[i];
                cantPos++;
            }
        }


        float promediosPos= (sumaPos/cantPos);
        float promedioNeg =(sumaNeg/cantNeg);
        //Imprimir los promedios
        System.out.println("El promedio de numeros positivos es: " + promediosPos );
        System.out.println("El promedio de numeros negativos es: " + promedioNeg );
        System.out.println("La cantidad de ceros es: " + cantCeros);
    }
}
