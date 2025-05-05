package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* public static void Espaco(){
            System.out.println("/n");
        }*/

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Olá, bem vindo ao nosso Banco!");
        System.out.println("Por favor,digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor,digite o nome da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor,digite o numero da Agência:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor,digite o seu saldo:");
        saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
