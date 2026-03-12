package cn.whpu.sky1.service;

import cn.whpu.sky1.entity.User;
import cn.whpu.sky1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    public User addUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userMapper.insert(user);
        return user;
    }
}
