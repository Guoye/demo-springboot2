package com.zhangguoye.demo.dao;

import com.zhangguoye.demo.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 查找用户列表
     * @return
     */
    List<User> queryUsers();

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    User queryUserByID(String id);

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(String id);
}
