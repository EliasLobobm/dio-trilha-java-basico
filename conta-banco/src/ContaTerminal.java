import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;
        System.out.println("===Bem vindo ao sitema BankWorld===");
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo inicial");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome+ " Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+conta+" e seu saldo é "+ saldo+" já disponível para saque");
    }
}
