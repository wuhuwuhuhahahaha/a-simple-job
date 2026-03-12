package cn.whpu.sky1.services;

import cn.whpu.sky1.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //添加用户
    RegisterDTO register(RegisterDTO registerDTO);


}
