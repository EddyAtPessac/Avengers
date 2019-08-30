package com.wcs.myProjectWithSecurity.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class HelloWorldContoller {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers... assemble";
    }

    @GetMapping("/secret-bases")
    public String [] secret () {
        String[] sites = {"Bordeaux", "La Loupe", "Lille", "Lyon",
                "Marseille", "Nantes", "Orléans", "Paris", "Reims", "Strasbourg", "Toulouse", "Tours"};
        return(sites);
    }
}
