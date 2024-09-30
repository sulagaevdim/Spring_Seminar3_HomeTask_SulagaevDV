package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;
@Service
public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public User createUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyUser(user);

        return user;
    }


}
