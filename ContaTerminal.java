package contaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Insira seu numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Insira o numero de sua agencia");
        String agencia = scanner.next();

        System.out.println("Insira seu nome");
        String nome = scanner.next();

        System.out.println("Insira o seu saldo");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +", conta " + numero + ", e seu saldo " + saldo + "Já está disponível para saque");

    }

}
