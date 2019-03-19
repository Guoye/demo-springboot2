package com.zhangguoye.demo.service.impl;

import com.zhangguoye.demo.dao.UserDao;
import com.zhangguoye.demo.entity.User;
import com.zhangguoye.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.queryUsers();
    }

    @Override
    public User getUser(String id) {
        return userDao.queryUserByID(id);
    }

    @Transactional
    @Override
    public boolean addUser(User user) {
        if (user.getUserLogin() !=null && !"".equals(user.getUserLogin())){
            try {
                int effectNum = userDao.insertUser(user);
                if (effectNum > 0 ){
                    return true;
                }else {
                    throw new RuntimeException("插入失败");
                }
            } catch (Exception e){
                throw new RuntimeException("插入失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("不能为空");
        }

    }

    @Override
    public boolean updateUser(User user) {
        if (user.getUserLogin() !=null && !"".equals(user.getUserLogin())){
            try {
                int effectNum = userDao.updateUser(user);
                if (effectNum > 0 ){
                    return true;
                }else {
                    throw new RuntimeException("更新失败");
                }
            } catch (Exception e){
                throw new RuntimeException("更新失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("不能为空");
        }
    }

    @Override
    public boolean deleteUser(String id) {
        if (id !=null && !"".equals(id)){
            try {


            int effectNum = userDao.deleteUser(id);
            if (effectNum > 0){
                return true;
            } else {
                throw new RuntimeException("删除失败");
            }
            } catch (Exception e){
                throw new RuntimeException("删除失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("不能为空");
        }
    }
}
