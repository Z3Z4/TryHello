package com.z3z4.TryHello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_World {
    @RequestMapping("/")
    public String index(){
        return "Uruguay3414141";
    }
}
