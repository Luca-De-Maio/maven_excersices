package com.example.distem.controllers;

import com.example.distem.models.User;
import com.example.distem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@CrossOrigin()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    //lo que esta en parentesis se llama casteo invoca instacia de arraylist y
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getOne(@PathVariable("id") Long pepito){
        return new ResponseEntity<>(userService.getById(pepito), HttpStatus.OK);
    }

    @GetMapping("/greeting")
    public String user(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }




}
