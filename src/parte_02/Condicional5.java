package parte_02;

import java.util.*;
class Condicional5 {
    public static void main ( String [] args ) {
       int num1, num2;
       Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero: ");
        num1= teclado.nextInt();
        System.out.printf("Digite o segundo numero: ");
        num2= teclado.nextInt();
        if (num1>num2) {
            System.out.printf("%d maior que %d\n", num1, num2);
        }else{
            System.out.printf("%d maior que %d\n", num2, num1);
        }


    
    }
}