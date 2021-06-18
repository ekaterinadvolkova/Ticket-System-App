package com.javaschool.ev.service.api;


import com.javaschool.ev.domain.Login;
import com.javaschool.ev.domain.User;

import java.time.LocalDate;
import java.util.List;


public interface UserService {

    int register(User user);

    User validateUser(Login login);

    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(int id);

    boolean checkUser(String firstname, String lastname, LocalDate birthdate);

}

