import java.util.Scanner;

public class MeuPrimeiroCodigoJAVA {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá!Bem vindo ao meu programa.");
        System.out.println("Digite seu nome:  ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:  ");
        int idade = scanner.nextInt();
        System.out.println("Olá "+nome+"!, você tem "+idade+" anos!");
          scanner.close();
    }
}
