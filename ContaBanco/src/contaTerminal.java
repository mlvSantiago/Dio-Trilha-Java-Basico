import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite o  Numero da conta");
        int numero= scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        
        System.out.println("Ola," + nome + "obrigado por criar umaconta em nosso Banco! ");
        System.out.println("Sua agencia é:" + agencia + " Numero da Conta:" + numero);
        System.out.println("O saldo Disponivel é:" + saldo + "reais");
        
        
    }    
}
