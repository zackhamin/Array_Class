package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.insert(80);
        numbers.insert(90);
        numbers.removeAt(4);
        System.out.println(numbers.indexOf(40));
        numbers.print();
    }
}
