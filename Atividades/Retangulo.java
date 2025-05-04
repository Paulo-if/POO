/*A classe deve incluir métodos para:
    Calcular a área do retângulo.
    Exibir informações sobre o retângulo.
*

 */
package Atividades;
import java.util.Scanner;

public class Retangulo {

    int baseRet;
    int alturaRet;

    //Construtor
    Retangulo(int baseRet, int alturaRet){
        this.baseRet = baseRet;
        this.alturaRet = alturaRet;
    }

    //Metodo para calcular a área
    public int CalculoArea() {
        return baseRet*alturaRet;
    }

    //Usando o toString:

    @Override
    public String toString(){
        return "Base= " + baseRet + "* Altura = "+alturaRet+" é igual a: "+ CalculoArea();
    }

    public static class Principal{
        public static void Main(String[][] args){

            //Construtor com parâmetros
            Retangulo r1 = new Retangulo(4, 5);

            System.out.println(r1.toString());

            System.out.println("Área: "+ r1.CalculoArea());
        }
    }
}
