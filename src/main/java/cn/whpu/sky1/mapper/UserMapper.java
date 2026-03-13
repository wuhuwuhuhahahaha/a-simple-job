package cn.whpu.sky1.mapper;

import cn.whpu.sky1.dto.RegisterDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (username, password) VALUES (#{username}, #{password})")
    int register(RegisterDTO registerDTO);
    
    @Select("SELECT * FROM user WHERE username = #{username}")
    RegisterDTO findByUsername(String username);

}
