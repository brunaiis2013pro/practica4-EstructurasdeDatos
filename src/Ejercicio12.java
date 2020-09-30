import java.util.Scanner;

public class Ejercicio12 {
    int marco[][];

    public Ejercicio12(){
        marco = new int[5][15];
    }

    public void ejecutar(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <15 ; j++) {
                if( (i==0) || (i==4)){//Rellenamos de unos el borde superior e inferior
                    marco[i][j] = 1;
                }
                else if( (j==0) || (j==14)){//Rellenamos de unos el borde izquierdo y derecho
                    marco[i][j] = 1;
                }
                else{
                    marco[i][j] = 0; //Rellenamos de ceros el interior
                }

            }
        }
    }

    public void mostrar(){
        System.out.println("La matriz es: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <15 ; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println("");
        }
    }
}
