import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner =  new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá seja bem vindo, informe o seu nome:");
        var name= scanner.next();
        // Validação para a agência (4 caracteres)
        String agency;
        while (true) {
            System.out.println("Por favor, digite o número da Agência (contendo 4 dígitos):");
            agency = scanner.next();
            if (agency.length() == 4 && agency.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Agência inválida! Deve conter exatamente 4 dígitos numéricos.");
            }
        }

        // Validação para o número da conta (4 caracteres)
        String number;
        while (true) {
            System.out.println("Por favor, digite o número da Conta (contendo 4 dígitos):");
            number = scanner.next();
            if (number.length() == 4 && number.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Número da conta inválido! Deve conter exatamente 4 dígitos numéricos.");
            }
        }

        float saldo = 237.48f;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.\n", 
        name, agency, number, saldo);

    }
}
