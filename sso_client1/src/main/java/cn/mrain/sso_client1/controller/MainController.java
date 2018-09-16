package cn.mrain.sso_client1.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 22
 */
@RestController
public class MainController {

    @GetMapping("/user")
    public Object user(Authentication user){
        return user;
    }
}
