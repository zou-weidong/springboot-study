package com.zou.study.demo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        OptionalDemo demo = new OptionalDemo();
        Integer integer1 = null;
        Integer integer2 = new Integer(10);

        Optional<Integer> value1 = Optional.ofNullable(integer1); //允许空值
        Optional<Integer> value2 = Optional.of(integer2);   //不允许

        System.out.println(demo.sum(value1,value2));



    }

    private Integer sum(Optional<Integer> value1, Optional<Integer> value2) {

        //isPresent 如果值存在就返回true,否则返回false
        System.out.println(value1.isPresent());
        System.out.println(value2.isPresent());

        //orElse 如果存在就返回它，如果不存在就返回默认值
        Integer integer1 = value1.orElse(10);

        Integer integer2 = value2.orElse(30);
        return  integer1 + integer2;
    }
}
