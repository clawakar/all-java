package com.java.tryout;

import java.util.*;

public class App {
    public static void main(String [] args) {
        //List<? super Fruit> list1 = new ArrayList<>();
        List<T extends Fruit> list2 = new ArrayList<>();

        //list1.add(new Apple());
        //list1.add(new Orange());
        //list1.add(new Fruit());

        //list2.add(new Fruit()); // error
        list2.add(new Apple()); // error
        list2.add(new Orange());// error

    }
}

class Fruit {

}

class Orange extends Fruit {

}

class Apple extends Fruit {

}