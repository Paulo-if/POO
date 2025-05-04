//ATIVIDADE 01
/*package Atividades;
import java.util.Scanner; //Biblioteca para usar o scanner

public class CadastroAluno{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //"Declaração do scanner para ser usado"

        System.out.println("Digite sue nome");
        String aluno = scanner.nextLine(); //Ta lendo o que o usuário digitou

        System.out.println("Digite a Média do aluno");
        float media = scanner.nextFloat();

        if (media < 6 ){
            System.out.println(aluno + " está reprovado");
        }else {
            System.out.println(aluno + " está aprovado");
        }
        scanner.close();
    }
}*/

//ATIVIDADE 02
package Atividades;
import java.util.Scanner; //Biblioteca para usar o scanner

public class CadastroAluno{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //"Declaração do scanner para ser usado"

        System.out.println("Digite sue nome");
        String aluno = scanner.nextLine(); //Ta lendo o que o usuário digitou

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu cargo");
        float media = scanner.nextFloat();

        if (media < 6 ){
            System.out.println(aluno + " está reprovado");
        }else {
            System.out.println(aluno + " está aprovado");
        }
        scanner.close();
    }
}

