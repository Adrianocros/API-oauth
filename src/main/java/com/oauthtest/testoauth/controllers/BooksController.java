package com.oauthtest.testoauth.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @RolesAllowed("user")
    @GetMapping
    public List<String> findaAll(){
        return Arrays.asList("Book 1,","Book 2", "Book 3");
    }


}
