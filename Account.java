public class Account {
    private double balance;
    private StringBuilder statement;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.statement = new StringBuilder();
        addToStatement("Saldo inicial: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addToStatement("Saque: -" + amount + ", Saldo restante: " + balance);
            System.out.println("Saque efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addToStatement("Depósito: +" + amount + ", Saldo restante: " + balance);
            System.out.println("Depósito efetuado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void addToStatement(String transaction) {
        statement.append("\n").append(transaction);
    }

    public void printStatement() {
        System.out.println("Extrato da conta:");
        System.out.println(statement.toString());
        System.out.println("Saldo atual: " + balance);
    }
}
