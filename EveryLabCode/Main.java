
import java.sql.SQLOutput;

import java.util.*;
public class Main {
    public static void main(String[]args){

      Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array :");

        int size = input.nextInt();
        int[] arr = new int[size];
int sum=0;
        System.out.println(" Enter value of array :");
        for (int i=0; i<size; i++)
        {
            arr[i]= input.nextInt();
            sum+=arr[i];

        }


            System.out.println("The value is "+sum);




     /* Scanner sc = new Scanner(System.in);
circle c1 = new circle();
        System.out.println(" enter radious :");
        c1.radious = sc.nextFloat();
        c1.area();

/* Lab1st s1 = new Lab1st();
        System.out.println("Enter your name: ");
      s1.name = sc.nextLine();

        System.out.println("Enter your id: ");
        s1.id = sc.nextInt();

        System.out.println(" Enter your CGPA: ");
        s1.cgpa= sc.nextFloat();

      s1.display();



       /* System.out.println("HELLO");

        Lab1st s1 =new Lab1st();
        s1.setValue("ABC",12,3.5F);
        s1.display();

        Lab1st s2 = new Lab1st();
        s2.name="CDE";
        s2.id=14;
        s2.display(); */





    }

}
