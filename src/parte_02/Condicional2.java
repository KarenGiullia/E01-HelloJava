package parte_02;

import java.util.*;
class Condicional2 {
    public static void main ( String [] args ) {
       int num;
       Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num= teclado.nextInt();
        if (num%7==0) {
            System.out.printf("E multiplo de 7\n");
        }else{
            System.out.printf("Nao e multiplo de 7\n");
        }


    
    }
}