import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta:");
        int conta = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência:");
        String ag = entrada.next();
        System.out.println("Por favor, digite o seu nome:");
        String nome = entrada.next();

        ContaTerminal terminal = new ContaTerminal(conta, ag, nome, 3500.00);

        System.out.println("Olá " + terminal.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + terminal.getAgencia() +
                ", conta " + terminal.getNumero() + " e seu saldo " + terminal.getSaldo() +
                " já está disponível para saque");
    }
}
