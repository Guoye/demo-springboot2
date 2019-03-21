package com.zhangguoye.demo.dao;

import com.zhangguoye.demo.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 查找用户列表
     * @return List<User>
     */
    List<User> queryUsers();

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return User实体
     */
    User queryUserByID(String id);

    /**
     * 插入用户
     * @param user 实体
     * @return 返回数据操作生效的记录数
     */
    int insertUser(User user);

    /**
     * 更新用户
     * @param user 实体
     * @return 返回数据操作生效的记录数
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return 返回数据操作生效的记录数
     */
    int deleteUser(String id);
}
