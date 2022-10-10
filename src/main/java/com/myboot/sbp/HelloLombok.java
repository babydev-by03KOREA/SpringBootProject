package com.myboot.sbp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    /*
    * public HelloLombok(String hello, int lombok) {
    *     this.hello = hello;
    *     this.lombok = lombok;
    * }
    * @RequiredArgsConstructor Annotation is DI
    * */

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("hello", 1000);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }

}
