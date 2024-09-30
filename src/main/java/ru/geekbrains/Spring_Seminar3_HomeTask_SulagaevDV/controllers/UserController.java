package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public RegistrationService service;
    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        service.registrationUser(user);
        return "User added from body!";
    }
}
