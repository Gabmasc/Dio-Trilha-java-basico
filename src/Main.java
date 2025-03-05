import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite seu nome: ");
        String nome = input.next();
        contaTerminal.setNomeCliente(nome);

        System.out.println("Digite sua agência: ");
        String agencia = input.next();
        contaTerminal.setContaAgencia(agencia);

        System.out.println("Digite seu numero da conta: ");
        int contanumero = input.nextInt();
        contaTerminal.setNumeroConta(contanumero);

        System.out.println("Digite seu saldo: ");
        double saldo = input.nextDouble();
        contaTerminal.setSaldo(saldo);


        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", muito obrigado por criar uma conta em nosso banco, sua agência é a " + contaTerminal.getContaAgencia() + " a conta é a " + contaTerminal.getNumeroConta() + " e o seu saldo de " + contaTerminal.getSaldo() + " já está disponível para saque.");


    }
}