package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<User> community;

    public Database(){
        community = new ArrayList<User>();
    }

    public void addUser(User user){
        community.add(user);
    }

    public List<User> getCommunity(){
        return community;
    }
}
