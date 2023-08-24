import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Banco Gringotes !!!");
        System.out.println("Qual o seu nome?");
        String Name = sc.nextLine();
        
        System.out.println("Por favor, digite o número da sua Agência ! ");
        String NumeroAgencia = sc.nextLine();
        
        System.out.println("Por favor, digite o número da sua conta !");
        int NumeroConta = sc.nextInt();
       
        System.out.println("Por favor, digite seu saldo ! ");
        float Saldo = sc.nextFloat();
        
        System.out.println("Olá " + Name + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        NumeroAgencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");


    }
}
