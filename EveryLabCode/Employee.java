package com.company;

public class Employee {
   public String companyname="kasif";
    private String name;
    private float salary;


    public void setName(String name){
        this.name=name;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
     public float getSalary(){
         return salary;
     }






    public void insert_value(String name, float salary){

        this.name=name;
        this.salary=salary;

    }

    public void display(){

        System.out.println(companyname);
        System.out.println(name);
        System.out.println(salary);
    }

    public Employee(){
        this.name="default";
        this.salary=0000f;
    }
    public Employee(String namea, float salary){
        this.name=name;
        this.salary=salary;
    }
    public Employee(String name){
       this.name=name;
       this.salary=00f;
    }
}
