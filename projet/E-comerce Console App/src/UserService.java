import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users; 

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User("user1", "user123", "customer"));
        users.add(new User("admin1", "admin123", "admin"));
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
