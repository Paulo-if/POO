package Atividades;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um número inteiro: ");
       int numero = scanner.nextInt();

       boolean ehPrimo = true;

       if (numero <=1){
           ehPrimo = false;
       }else{
           for (int i=2; i< numero; i++){
               if (numero %i ==0){
                   ehPrimo = false; // Aqui o resto da divisao tem que ser 1 para o numero ser primo, se for 0, sigznifica que existe outro numero capaz de dividi-lo
               }
           }
       }
        if (ehPrimo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }

        scanner.close();
    }
}
