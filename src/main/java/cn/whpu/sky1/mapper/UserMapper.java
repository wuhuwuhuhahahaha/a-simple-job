package cn.whpu.sky1.mapper;

import cn.whpu.sky1.dto.RegisterDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (username, password) " +
            "VALUES (#{username}, #{password})")

    RegisterDTO register(RegisterDTO registerDTO);

}
