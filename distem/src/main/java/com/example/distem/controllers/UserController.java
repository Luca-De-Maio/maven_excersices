package com.example.distem.controllers;

import com.example.distem.models.User;
import com.example.distem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    //lo que esta en parentesis se llama casteo invoca instacia de arraylist y
    public String getAll(){
         ArrayList<User>  lta = (ArrayList<User>) userService.getAll();
        return "user";
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getOne(@PathVariable("id") Long pepito){
        return userService.getById(pepito);
    }

    @GetMapping("/greeting")
    public String user(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }




}
