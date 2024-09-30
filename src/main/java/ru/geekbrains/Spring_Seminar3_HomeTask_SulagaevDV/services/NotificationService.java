package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;

@Service
public class NotificationService {
    public void notifyUser(User user){
        System.out.println("A new user has been created: " + user.getName());
    }
}
