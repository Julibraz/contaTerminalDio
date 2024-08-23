import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ContaBanco contaBanco = new ContaBanco();
        System.out.println("Informe o numero da conta: ");
        contaBanco.setNumeroConta(scan.nextInt());
        scan.nextLine(); // Consumir a nova linha

        System.out.println("Informe a agencia: ");
        contaBanco.setAgencia(scan.nextLine());

        System.out.println("Informe o seu nome: ");
        contaBanco.setNome(scan.nextLine());

        System.out.println("Informe o saldo a ser adicionado na conta: ");
        contaBanco.setSaldo(scan.nextDouble());

        System.out.println("\n\n");

        System.out.println("Ola " + contaBanco.getNome() + " obrigado por criar uma conta em nosso banco, sua agência é "
                + contaBanco.getAgencia() + ", conta " + contaBanco.getNumeroConta() + " e o seu saldo de R$"
                + contaBanco.getSaldo() + " já está disponível para saque.");
    }
}
