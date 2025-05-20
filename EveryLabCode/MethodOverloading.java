package com.company;

public class MethodOverloading {

    static void myMethod( ){
        System.out.println("Risadaul Islam");
    }

    static void myMethod(String arg){
        System.out.println("Name :"+arg);
    }

    static void myMethod(String arg1, String arg2){
        System.out.println("First Name :"+arg1+" "+"last Name :"+arg2);
    }

    static void myMethod(String arg,int a){
        System.out.println("My name is:"+arg+ "my id is :"+ a);
    }

    static void myMethod(int a, int b ){
        System.out.println("integer1 :"+a+ "integer2:"+ b);
        int sum=a+b;
        System.out.println("sum :"+sum);
    }

    public static void main(String[] args) {
        myMethod();
        myMethod("Risadul Islam");
        myMethod("Risadul","Islam");
        myMethod("Risadul Islam",166);
        myMethod(5,6);

    }


}
