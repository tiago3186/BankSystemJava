public class User {
    private String username;
    private String password;
    private Account account;

    public User(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.account = new Account(initialBalance);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Account getAccount() {
        return account;
    }
}
