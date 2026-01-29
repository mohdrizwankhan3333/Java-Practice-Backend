package org.example.controller;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    public void createUser(String user){
        userService.addUser(user);
        System.out.println("User added \n"+user);

    }

    public void getAllUsers(){
        List<String> users = userService.getAllUser();
        System.out.println("Users:");
        for (String user : users){
            System.out.print(user+" ");
        }
    }
}
