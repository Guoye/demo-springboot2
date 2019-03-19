package com.zhangguoye.demo.service;

import com.zhangguoye.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(String id);

    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(String id);
}
