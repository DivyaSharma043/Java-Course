package Racloop;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) 
    {
    int remainder, number, sum=0;
    Scanner sc = new Scanner(System.in);
    
    System.out.format("\nEnter the value of 5-digit-number: ");
    number = sc.nextInt();
     while(number > 0)
     {
         remainder = number % 10;
         sum = sum + remainder;
         number = number / 10;
     }
          
    System.out.println("Sum of the 5 digit numbers: "+ sum);
    
    }
    
}
