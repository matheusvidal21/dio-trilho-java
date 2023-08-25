import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pela scanner os valores digitados no terminal

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();

        sc.nextLine();
        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu saldo: ");
        double saldo = sc.nextDouble();

        // Exibir a mensagem da conta criada

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.3f, já está disponível para o saque. %n", nome, agencia, conta, saldo);

    }
}
