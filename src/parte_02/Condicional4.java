package parte_02;

import java.util.*;
class Condicional4 {
    public static void main ( String [] args ) {
       int num;
       Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite uma nota: ");
        num= teclado.nextInt();
        if (num>=90) {
            System.out.printf("Conceito: A\n");
        }else if(num>=80 && num<90){
            System.out.printf("Conceito: B\n");
        }else if(num>=70 && num<80){
            System.out.printf("Conceito: C\n");
        }else if(num>=60 && num<70){
            System.out.printf("Conceito: D\n");
        }else if(num>=40 && num<60){
            System.out.printf("Conceito: E\n");
        }else{
            System.out.printf("Conceito: F\n");
        }


    
    }
}