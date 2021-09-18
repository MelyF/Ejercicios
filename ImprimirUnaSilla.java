import java.util.Scanner;

public class ImprimirUnaSilla {
    public static void main(String[] args) {

        //Ingreso de tañano de matriz por el usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero : ");
        int a = teclado.nextInt();
        // definicion de la matriz
        Integer[][] matriz = new Integer[a][a];

        if (a == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        //Calculamos la fila que representa el asiento de la silla
        int med = (a / 2) + 1;

        // Recorremos la matriz para formar la silla y rellenamos con 1 y 0
        //segun corresponda
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((j== 0) && (i < med)||(i==med-1) ||((j==a-1)&&(i>=med))){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j]=0;
                }

            }
        }
        //Imprimimos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
