package com.javaschool.ev.service.impl;

import com.javaschool.ev.dao.api.UserDao;
import com.javaschool.ev.domain.Login;
import com.javaschool.ev.domain.User;
import com.javaschool.ev.dto.UserDTO;
import com.javaschool.ev.mapper.UserMapper;
import com.javaschool.ev.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public int register(User user) {
        return userDao.register(user);
    }

    @Override
    @Transactional
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> allUsers() {
        List<User> users = userDao.allUsers();
        List<UserDTO> dtos = new ArrayList<>();
        for (User user: users){
            dtos.add(userMapper.convertToDto(user));
        }

        return dtos;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }

    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public boolean checkUser(String firstname, String lastname, LocalDate birthdate) {
        return userDao.checkUser(firstname, lastname, birthdate);
    }

}

