package com.company;

public class Main {

    public static void main(String[] args) {
        int suma, resta;
        suma = sum(1,9);
        resta = subtract(2,7);
        System.out.println(suma+" "+resta);
    }
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
    public static int subtract(int a, int b){
        int c = a-b;
        return c;
    }
    public static int multiplication(int a, int b){
        int c = a*b;
        return c;
    }
    public static int division(int a, int b){
        int c = a/b;
        return c;
    }
}
