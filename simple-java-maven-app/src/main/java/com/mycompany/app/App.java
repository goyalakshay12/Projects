package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World to Infoblox!";
   
    private final Integer sum()
    {
         int a =10, b=20;
         int c;
         c = a+b;
    }

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getSum());
    }

    private final String getMessage() {
        return message;
    }
    private final Integer getSum() {
        return sum();
    }

}
