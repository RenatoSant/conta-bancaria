import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {



        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o numero da sua conta: ");
        int digiNumero = scanner.nextInt();
        if (digiNumero == numero){
            System.out.println("Por favor digite o numero da agência");
            String digiAgencia = scanner.nextLine();
            if (digiAgencia.equals(agencia)){
                System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco," +
                        "sua agencia é " + agencia +  " e seu saldo " + saldo + " já está disponivel" +
                        " para saque.");
            }
        }
        else {
            System.out.println("Numero incorreto.");
        }


    }
}