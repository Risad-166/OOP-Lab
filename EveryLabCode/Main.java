package com.company;

public class Main {

    public static void main(String[] args){

    /*    Employee  em1= new Employee();
        em1.display();

        Employee emp2 = new Employee();
        emp2.display();

        Employee emp3 = new Employee("mahir", 80000.2f);
        emp3.display();

        Employee emp4 = new Employee("humayra akter himu");
        emp4.display();   */


        Employee e1 = new Employee();
        e1.setName("ABC");
        e1.setSalary(2000.22f);

        System.out.println(e1.getName()+" "+e1.getSalary());

    }
}
