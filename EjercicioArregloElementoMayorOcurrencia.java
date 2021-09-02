import java.util.Scanner;

public class EjercicioArregloElementoMayorOcurrencia {

    public static void main(String[] args) {

        Integer[] arreglo = new Integer[7];

        Scanner teclado = new Scanner(System.in);

        //Ingresamos los datos al arreglo
        for (int i = 0; i <= arreglo.length - 1; i++) {
            System.out.print("Ingrese un numero (1 al 9): ");
            arreglo[i] = teclado.nextInt();
        }

        //creamos un segundo arreglo para guardar la cantidad de valores que se repite un numero
        Integer[] aux= new Integer[arreglo.length];

        //buscamos recorriendo el primer arreglo las cantidades de ocurrencia
        // de los elementos y las agregamos al arreglo auxiliar
        for (int i = 0; i <= arreglo.length-1; i++) {
            int cant = 0;
            for (int j = 0; j <= arreglo.length-1; j++) {
                if (arreglo[i].equals(arreglo[j])) {
                    cant++;
                }
            }

                aux[i]=cant;
            }
        //obtenemos el valor del elemento veces repetido
        // y la pocicion para obtener el numero mas repetido
        int pos =0, may=0;
        for(int i=0; i<= aux.length-1; i++){
            if(may< aux[i]){
                may=aux[i];
                pos=i;
            }

        }
        System.out.println("Elemento que aparece mas veces:  " + arreglo[pos]);
        System.out.println("Cantidad de veces que aparece: " + may);

        }

    }

