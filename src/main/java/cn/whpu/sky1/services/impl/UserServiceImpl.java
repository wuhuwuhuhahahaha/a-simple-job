package cn.whpu.sky1.services.impl;

import cn.whpu.sky1.dto.RegisterDTO;
import cn.whpu.sky1.services.UserService;
import cn.whpu.sky1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    @Override
    public RegisterDTO register(RegisterDTO registerDTO) {
        if (registerDTO.getPassword() == null || registerDTO.getPassword().length() < 6) {
            throw new RuntimeException("密码长度不能低于 6 位");
        }
        
        String encodedPassword = encoder.encode(registerDTO.getPassword());
        registerDTO.setPassword(encodedPassword);
        
        userMapper.register(registerDTO);
        return registerDTO;
    }
    
    public Boolean login(String username, String password) {
        if (password == null || password.length() < 6) {
            throw new RuntimeException("密码长度不能低于 6 位");
        }
        
        RegisterDTO user = userMapper.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }
        
        boolean matches = encoder.matches(password, user.getPassword());
        if (!matches) {
            throw new RuntimeException("密码错误");
        }
        
        return true;
    }
}