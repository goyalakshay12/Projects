package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World to Infoblox";
    public static Integer add(Integer a, Integer b) {
        if (a == null) {
            return null;
        }
        if (b == null) {
            return null;
        }
        return a + b;
    }

    public App() {}

    public static void main(String[] args) {
        int a = 10;
        int b=20;
        System.out.println(new App().getMessage());
        System.out.println(new App().add(a,b));
    }

    private final String getMessage() {
        return message;
    }
  

}
