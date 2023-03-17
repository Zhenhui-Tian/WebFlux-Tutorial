package com.tzh.functionalreference;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = MyFunctionClass::doSomthing;

    }
}
