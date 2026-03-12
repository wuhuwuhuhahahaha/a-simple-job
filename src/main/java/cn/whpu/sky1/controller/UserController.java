package cn.whpu.sky1.controller;

import cn.whpu.sky1.common.Result;
import cn.whpu.sky1.entity.User;
import cn.whpu.sky1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/add")
    public Result<User> addUser(@RequestBody User user) {
        User addedUser = userService.addUser(user.getUsername(), user.getPassword());
        return Result.success(addedUser);
    }
}
