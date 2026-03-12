package cn.whpu.sky1.controller;


import cn.whpu.sky1.comment.Result;
import cn.whpu.sky1.dto.RegisterDTO;
import cn.whpu.sky1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {
    /**
     * 测试接口
     * 以前autowired注入，现在用构造函数注入更流行，且spring4.x版本里，有新的注解
     */
    @Autowired
    private UserService userService;

    @GetMapping("/success")
    public Result<String> success(@RequestBody RegisterDTO registerDTO) {
        return Result.success("你好");
    }
}
