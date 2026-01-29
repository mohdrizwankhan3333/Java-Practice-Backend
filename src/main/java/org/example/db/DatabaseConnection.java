package org.example.db;
import org.springframework.stereotype.Component;

import java.util.*;

public class DatabaseConnection {

    private List<String> users;

    public void  init(){
        users = new ArrayList<>();
        System.out.println("DB Connected");
    }
    public List<String> getUsers(){
        return users;
    }
    public void addUser(String user){
        users.add(user);
    }
    public void cleanUp(){
        System.out.println("DB Clean Up");
    }
}
