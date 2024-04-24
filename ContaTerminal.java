import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Por favor, digite a agência da conta: ");
        agencia = sc.next();
        sc.nextLine();
        System.out.print("Por favor, digite o nome do dono da conta: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo atual da conta: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println(STR."Olá \{nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numeroConta} e seu saldo \{saldo} já está disponível para saque");
    }
}