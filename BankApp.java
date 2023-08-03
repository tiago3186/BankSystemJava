import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Criar alguns usuários para teste
        bank.createUser("user", "user", 1000);
        bank.createUser("admin", "admin", 5000);

        Scanner scanner = new Scanner(System.in);

        // Fazer login
        System.out.print("Digite seu usuário: ");
        String username = scanner.next();
        System.out.print("Digite sua senha: ");
        String password = scanner.next();

        User user = bank.login(username, password);
        if (user == null) {
            System.out.println("Usuário ou senha inválidos. Encerrando o programa.");
            return;
        }

        // Após o login bem-sucedido, mostrar o menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Extrato");
            System.out.println("4. Sair");
            System.out.print("Escolha a opção desejada: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o valor para sacar: ");
                    double withdrawAmount = scanner.nextDouble();
                    user.getAccount().withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double depositAmount = scanner.nextDouble();
                    user.getAccount().deposit(depositAmount);
                    break;
                case 3:
                    user.getAccount().printStatement();
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco. Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
