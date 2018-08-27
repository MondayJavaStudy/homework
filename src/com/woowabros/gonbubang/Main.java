package com.woowabros.gonbubang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("step1============");
        step1();
        System.out.println("step2============");
//        step2();
        System.out.println("step3============");
        step3();
        System.out.println("step4============");
        step4();
        System.out.println("step5============");
        step5();
        System.out.println("step6============");
//        step6();
    }

    public static void step1() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }
    }

    public static void step2() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (String fruit : fruits) {
            if ("Apple".equals(fruit)) {
                fruits.remove(fruit);
            }
        }
    }

    public static void step3() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }
        }
    }

    public static void step4() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (int i = (fruits.size() - 1); i >= 0; i--) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }
    }

    public static void step5() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        Iterator<String> fruitIterator = fruits.iterator();
        fruits.set(0, "Watermelon");
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }
    }

    public static void step6() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        Iterator<String> fruitIterator = fruits.iterator();
        fruits.add("Watermelon");
        while (fruitIterator.hasNext()) {
//            System.out.println(fruitIterator.next());
        }
    }


}
