package Racloop;
import java.util.*;
public class CallingFunction {
    
    static void multiplication_tables()
    {
        System.out.println("-------------------Tables--------------------");
       int number, value;
       
       // getting input from keyboard
       System.out.println("Enter the number which you get the table : ");
       Scanner sc = new Scanner(System.in);
       number = sc.nextInt();
       System.out.println("Table of "+number + ": ");  
      // for table 
      for(int i = 1; i<11;i++)
       {
        value = number * i;
        
        System.out.println(number +" * "+ i +"= " + value);
       }
    }
    public static void main(String[] args)
    {
        
        // calling the static function
        multiplication_tables();
    }
}
