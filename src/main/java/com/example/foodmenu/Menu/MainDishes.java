package com.example.foodmenu.Menu;
import java.util.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class MainDishes {
    String MainDish;
    public MainDishes(){

    }



    public void setMainDish(String mainDish) {
        MainDish = mainDish;
    }

    public String getMainDish() {
        return MainDish;
    }


}
