package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;

@Service
public class RegistrationService {
    @Autowired
    private UserService userService;
    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private NotificationService notificationService;

    public void registrationUser(User user){
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
