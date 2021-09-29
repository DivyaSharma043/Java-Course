package Racloop;
import java.util.*;
public class Recursion {
            public static void main(String[] args)
            {
                int n, value;
                System.out.println("Enter any number: ");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                
              value =  fibonacci(n);
              System.out.println("Fibonacci Series: "+ value);
              
            }
            
            static int fibonacci(int k)
            {
                              
                if(k <=1)
                    return k;
                else
                    return fibonacci(k-1) + fibonacci(k-2);
                
            }

  
}
