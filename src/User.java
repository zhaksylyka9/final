import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String login;
    private String password;
    private String gender;

    public User() {
    }

    public User(Integer id, String userName, String login, String password, String gender) {
        this.id = id;
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
