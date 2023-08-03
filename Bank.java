import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, User> users;

    public Bank() {
        this.users = new HashMap<>();
    }

    public void createUser(String username, String password, double initialBalance) {
        users.put(username, new User(username, password, initialBalance));
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
