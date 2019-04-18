package model;

public class User {
    private static int count = 0;

    private int id;
    private String userName;
    private char[] password;

    public User(String userName, char[] password){
        this.id = count;
        this.userName = userName;
        this.password = password;

        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
