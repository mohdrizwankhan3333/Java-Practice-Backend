package org.example;

import org.example.config.AppConfig;
import org.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController = context.getBean(UserController.class);
        userController.createUser("Mohd");
        userController.createUser("Rizwan");
        userController.createUser("Khan");
        userController.getAllUsers();
    }

}