package sales.savvy.sales.savvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sales.savvy.sales.savvy.entity.Users;
import sales.savvy.sales.savvy.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/signUp")
    public String signUp(@RequestBody Users users) {
        service.addUser(users);
        System.out.println(users);
        return "Success!!";
    }
}
