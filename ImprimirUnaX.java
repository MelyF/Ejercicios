import java.util.Scanner;

public class ImprimirUnaX {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero : " );
        int a=teclado.nextInt();
        String [][] matriz =new String[a][a];

        for(int i=0; i< matriz.length; i++){
            for(int j =0; j< matriz[i].length; j++){
                if((i==j) ||(j == a-i-1)){
                    matriz[i][j]="X";
                }else{
                    matriz[i][j]="_";
                }
            }
        }
        System.out.println();

        for(int i=0; i<matriz.length;i++){
            for(int j=0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
