package com.inesh.hellocontroller.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/fakeStore/{id}", method = RequestMethod.GET)
    public String Hello(@PathVariable("id") String id) {
        return "Hello " + id;
    }
}
