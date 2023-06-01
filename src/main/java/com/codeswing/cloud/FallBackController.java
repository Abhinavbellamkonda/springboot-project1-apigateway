package com.codeswing.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/user")
    public String userFallBack(){
        return "The user service is talking longer than expected"+
                " please try again later.";
    }

    @GetMapping("/department")
    public String departmentFallBack(){
        return "The user service is talking longer than expected"+
                " please try again later.";
    }
}
