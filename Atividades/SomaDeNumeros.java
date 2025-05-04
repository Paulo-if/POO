package Atividades;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero<1){
        System.out.println("O número é inválido por se menor que 1");
        }else {
            for (int i=1; i<numero; i++){
                int numeroIncrementado = i+i;
                System.out.println(numeroIncrementado);
            }

        }
    }
}
