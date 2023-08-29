package parte_03;

import java.util.*;
class Repeticao4 {
    public static void main ( String [] args ) {
        int num, fatorial=1;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num= teclado.nextInt();
        for (int i = 1; i <=num; i++) {
            fatorial=fatorial*i;
        }
        System.out.printf("%d\n", fatorial);

    
    }
}