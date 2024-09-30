package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;
@Service
public class UserService {

    public User createUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        return user;
    }


}
