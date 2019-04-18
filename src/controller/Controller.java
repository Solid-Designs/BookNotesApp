package controller;

import gui.FormEvent;
import model.Database;
import model.User;

import java.util.List;

public class Controller {
    private Database db = new Database();

    public void createUser(FormEvent ev){
        String userName = ev.getUserName();
        char[] password = ev.getPassword();

        User user = new User(userName, password);
        db.addUser(user);
    }

    public List<User> getCommunity(){
        return db.getCommunity();
    }
}
