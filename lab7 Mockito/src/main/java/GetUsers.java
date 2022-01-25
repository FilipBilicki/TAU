import java.util.ArrayList;
import java.util.List;

public class GetUsers {
    public UsersList users;

    public GetUsers(UsersList users) {
        this.users =  users;
    }

    public List<String> getUsers(String user) {

        List<String> retriveUsers = new ArrayList<String>();
        List<String> getUsers = users.getNames(user);

        for(String users : getUsers) {
            if(users.contains("F")) {
                retriveUsers.add(users);
            }
        }
        return retriveUsers;
    }
}

