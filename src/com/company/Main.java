package com.company;

import java.util.ArrayList;
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
//        numbers.removeAt(4);
        numbers.print();
        numbers.reverse();
//        System.out.println(numbers.indexOf(40));
//        numbers.max();
//        numbers.print();

//        ArrayList<Integer> numbersTwo = new ArrayList<>();
//        numbersTwo.add(10);
//        numbersTwo.add(20);
//        numbersTwo.add(30);
//        numbersTwo.add(40);
//        numbersTwo.add(50);
//        numbersTwo.add(60);
//        numbersTwo.remove(3);
//        System.out.println(numbersTwo);
    }
}
