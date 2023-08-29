package parte_02;

import java.util.*;
class Condicional3 {
    public static void main ( String [] args ) {
       int num;
       Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite a nota: ");
        num= teclado.nextInt();
        if (num>=60) {
            System.out.printf("Aluno passou de ano\n");
        }else{
            System.out.printf("Aluno nao passou de ano\n");
        }


    
    }
}