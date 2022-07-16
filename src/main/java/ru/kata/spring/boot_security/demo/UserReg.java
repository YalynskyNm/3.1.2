package ru.kata.spring.boot_security.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

public class UserReg {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(User.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("Jan", "White", (byte) 25));
        userService.add(new User("Lina", "Black", (byte) 43));
        userService.add(new User("Sam", "Red", (byte) 30));
        userService.add(new User("Bob", "Green", (byte) 18));

        for (User user : userService.listUsers()) {
            System.out.println(user);
        }
    }
}
