package com.zhangguoye.demo.controller;


import com.zhangguoye.demo.entity.User;
import com.zhangguoye.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 注入 userService
     */
    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @return 用户列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Object> getUserlist() {
        Map<String, Object> modalMap = new HashMap<>();
        modalMap.put("data", userService.getUsers());
        return modalMap;
    }

    /**
     * 根据用户id获取用户信息
     * @param id 用户id
     * @return 用户实体
     */
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUserByID(@PathVariable(value = "userId") String id) {
        User u = userService.getUserById(id);
        u.setUserPass(null);
        u.setUserStatus(0);
        return u;
    }

    /**
     * 添加新用户
     * @param user 用户实体，以content-type->application/json方式传参
     * @return 成功与否的Map
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Map<String, Object> addUser(@RequestBody User user) {
        Map<String, Object> modalMap = new HashMap<>();
        modalMap.put("success", userService.addUser(user));
        return modalMap;
    }

    /**
     * 更新用户信息
     * @param user 用户实体，以content-type->application/json方式传参
     * @return 成功与否的Map
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map<String, Object> updateUser(@RequestBody User user){
        Map<String, Object> modalMap = new HashMap<>();
        modalMap.put("success",userService.updateUser(user));
        return modalMap;
    }

    /**
     * 物理删除用户
     * @param id 用户id
     * @return 成功与否的Map
     */
    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE)
    public Map<String, Object> deleteUser(@PathVariable(value = "userId") String id){
        Map<String, Object> modalMap = new HashMap<>();
        modalMap.put("success", userService.deleteUser(id));
        return modalMap;
    }
}
