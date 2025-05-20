public class Teacher {

    String name;
    int salary;


    void display(){
        System.out.println("Name is "+ this.name+"salary is "+this.salary);
    }
    void setValue(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    int getSalary(){
        return salary;
    }

}

