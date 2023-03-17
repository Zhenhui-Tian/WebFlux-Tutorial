package com.tzh.functionalinterface;

import java.util.function.*;

public class CommanlyInterfaces {
    public static void main(String[] args) {
        /** predicate 翻译为断言, 断言的英英翻译如下
         * 断: 判断, 言: 勿谓言之不预也. 就是判断.
        **/
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(1));

        /** consumer 消费, 也就是接收参数, 但不返回.
         * 调用函数是accept
         */
        Consumer<Integer> consumer = x -> System.out.println(x+1);
        consumer.accept(5);

        System.out.println("Supplier ");
        Supplier<Integer> supplier = () -> 9;
        System.out.println(supplier.get());

        System.out.println("BinaryOperator, two same type parameter and return same type result");
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(1, 2));

        System.out.println("Function");
        Function<Integer, String> function = x -> "String is " + x;
        System.out.println(function.apply(5));

        System.out.println("BiFunction, pass T, U and return R type");
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> "outputString" + (x +y);
        System.out.println("Rusult : " + biFunction.apply(1, 2));

        System.out.println("UnaryFunction, pass one parmater and return same type result");


    }
}
