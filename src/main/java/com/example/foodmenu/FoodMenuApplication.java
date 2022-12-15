package com.example.foodmenu;

import com.example.foodmenu.Menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FoodMenuApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ac = SpringApplication.run(FoodMenuApplication.class, args);
        Menu menu = ac.getBean(Menu.class);

        menu.menu1();


    }

}
