//ATIVIDADE 02
package Atividades;
import java.util.Scanner;

public class CadastroFuncionario{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); //Consumir a quebra de linha deixada pelo enter do usuário
        System.out.println("Digite o cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário: ");
        float salario = scanner.nextFloat();

        if (idade >60){
            System.out.println(nome + " funcionário aposentado");
        }
        if (salario > 5000){
            System.out.println(nome + " tem um salário alto");
        }else{
            System.out.println(nome + " tem um salário baixo");
        }
        scanner.close();
    }
}
