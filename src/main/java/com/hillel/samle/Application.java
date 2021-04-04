package com.hillel.samle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(0);

        Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .forEach(item -> {
                    if (item > intArr.get(0)) {
                        intArr.set(0, item);
                    }
                });

//        intArr = Collections.emptyList();
        System.out.println(intArr.get(0));


       /* final Integer integer = Arrays.asList("1212", "sfdgsg", "sgsdgd78", "4", "5vhd")
                .stream()
                .map(String::length)
                .max(Integer::compareTo)
                .stream().findFirst().orElse(0);
        System.out.println(integer);*/
    }
}
