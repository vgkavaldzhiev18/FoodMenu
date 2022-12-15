package com.example.foodmenu.Menu;


import org.springframework.stereotype.Component;

@Component
public class Salad {

    String Salad;
    public Salad(){
    }

    public String getSalad() {
        return Salad;
    }

    public void setSalad(String salad) {
        Salad = salad;
    }
}
