import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int conta;
        double saldo;
        String agencia, nome;

        System.out.println("Qual o número da sua conta? ");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o número da sua agência? ");
        agencia = scanner.nextLine();

        System.out.println("Qual seu nome? ");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        if (saldo > 0) {
            System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                    agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque!");
        } else {
            System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                    agencia + ", conta " + conta + " e seu saldo de " + saldo
                    + ". Deposite algum valor para poder sacar!");
        }
    }
}
