package Atividades;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Informe o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();

        System.out.println("Informe o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");

        }if(lado1 == lado2){
            if (lado2 != lado3) {
                System.out.println("Triângulo Isósceles");
            }
        }else{
            System.out.println("Triângulo Escaleno");
        }
    }
}
