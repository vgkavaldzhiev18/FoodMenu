package com.example.foodmenu.Menu;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class Menu {

    public Menu(){

    }

    @GetMapping(value="/")
    public String menu1(){
        System.out.println("Main Dishes: 1.Musaka\n" +
                "2.Pileshka Soup\n" +
                "3.Bob\n" +
                "Salads: 1. Shopska\n" +
                "2.Ovcharska\n" +
                "3.Mlechna\n");
        return "index";
    }

}
