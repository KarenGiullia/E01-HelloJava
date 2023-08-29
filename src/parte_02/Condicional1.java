package parte_02;

import java.util.*;
class Condicional1 {
    public static void main ( String [] args ) {
       int num;
       Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num= teclado.nextInt();
        if (num%2==0) {
            System.out.printf("E par\n");
        }else{
            System.out.printf("E impar\n");
        }


    
    }
}