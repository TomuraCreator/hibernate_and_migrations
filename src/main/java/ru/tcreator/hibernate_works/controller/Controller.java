package ru.tcreator.hibernate_works.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.hibernate_works.entity.Test;

@RequestMapping("/")
@RestController
public class Controller {


    @GetMapping("test")
    public Test getString() {
        return new Test("test", "Testing", 1);
    }

    @GetMapping("pun")
    public Test getStringPun() {
        return new Test("test", "Testing", 1);
    }
}
