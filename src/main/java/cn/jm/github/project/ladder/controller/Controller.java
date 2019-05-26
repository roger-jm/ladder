package cn.jm.github.project.ladder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ladder/v1/1")
public class Controller {

    @GetMapping(value = "/sayhi")
    public String sayHi(){
        return "hi";
    }
}
