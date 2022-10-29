package behavioral.chainOfResponsibility;

public class Request {
    private final String username;
    private final String password;
    private final String role;

    public Request(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Account information: " +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + "'";
    }
}
