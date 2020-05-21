import java.util.HashMap;

public class Registry {
    private static HashMap<String,User> users= new HashMap<String, User>();    public Registry() {
        this.initialized();
    }

    private void initialized() {
        User user = new Admin("randima","randima@gmail.com");
        users.put("ADMIN",user);
        User user1 = new Student("Deshani","deshani@gmail.com");
        users.put("STUDENT",user1);
    }

    public static HashMap<String, User> getUsers() {
        return users;
    }

    public static void setUsers(HashMap<String, User> users) {
        Registry.users = users;
    }

    public User getUser(String role){
        User user = null;
        try {
            user = (User) users.get(role).clone();
        } catch (CloneNotSupportedException e) {

        }
        return user;
    }
}
