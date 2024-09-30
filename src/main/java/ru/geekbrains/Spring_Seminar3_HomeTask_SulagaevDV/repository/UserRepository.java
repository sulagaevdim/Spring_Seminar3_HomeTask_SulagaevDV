package ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.Spring_Seminar3_HomeTask_SulagaevDV.domain.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();







    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
