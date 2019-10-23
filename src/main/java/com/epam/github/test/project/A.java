package com.epam.github.test.project;

class A {

    public String variable = defineVariable();

    public A() {
        System.out.println(variable);
        text();
    }

    public String defineVariable() {
        return "class A variable";
    }

    public static void text() {
        System.out.println("class A text method");
    }

}

class B extends A {

    public String variable = defineVariable();

    public B() {
        System.out.println(variable);
        text();
    }

    public String defineVariable() {
        return "class B variable";
    }

    public static void text() {
        System.out.println("class B text method");
    }

}