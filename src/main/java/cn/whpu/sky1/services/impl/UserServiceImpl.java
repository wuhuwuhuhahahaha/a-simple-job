package cn.whpu.sky1.services.impl;

import cn.whpu.sky1.dto.RegisterDTO;
import cn.whpu.sky1.services.UserService;
import cn.whpu.sky1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public RegisterDTO register(RegisterDTO registerDTO) {
        return userMapper.register(registerDTO);
    }
}