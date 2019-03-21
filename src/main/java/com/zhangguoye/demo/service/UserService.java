package com.zhangguoye.demo.service;

import com.zhangguoye.demo.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     * @return List<User>用户列表
     */
    List<User> getUsers();

    /**
     * 根据用户id获取用户信息
     * @param id 用户id
     * @return User实体
     */
    User getUserById(String id);

    /**
     * 添加用户
     * @param user 用户的实体
     * @return boolean成功与否
     */
    boolean addUser(User user);

    /**
     * 添加用户
     * @param user 用户的实体
     * @return boolean成功与否
     */
    boolean updateUser(User user);

    /**
     * 根据用户id物理删除用户
     * @param id 用户id
     * @return boolean成功与否
     */
    boolean deleteUser(String id);
}
