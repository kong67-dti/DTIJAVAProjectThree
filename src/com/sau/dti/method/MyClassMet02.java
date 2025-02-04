package com.sau.dti.method;

public class MyClassMet02 {
    //ประเภทของ Method
    //1. มี parameter ไม่มี return
    public static void showWow() {
        System.out.println("Wow Wow Wow");


    }
    //2. มี parameter ไม่มี return
    public static void sumNumber(int num1, int num2) {
        System.out.println(num1 + num2);

    }
    //3. ไม่มี parameter มี return
    public static String showSawasdee() {
        return  "Sawasdee Jaaaaa...";

    }
    //4. มี parameter มี return
    public static Double calPowNumber(int a, int b) {
        return  Math.pow(a,b);

    }

    public static void main(String[] args) {
        showWow();
        showWow();

        sumNumber(10,20);
        sumNumber(100,200);

        System.out.println(showSawasdee());
        String data = showSawasdee();
        System.out.println(data + "NinniN");

        System.out.println(calPowNumber(10,2));
        double result = calPowNumber(5,3);

        System.out.println("5^3 = " + result);
    }
}
