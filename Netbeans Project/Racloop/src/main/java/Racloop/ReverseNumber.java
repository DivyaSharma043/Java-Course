package Racloop;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args)
    {
        int remainder, number, reverse=0;
        
        // TAkING INPUT FROM KEYBOARD
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        
        //ONLY ACCEPT 5-DIGITS NUMBER
        /*if(number >= 10000 && number <= 99999)
        {*/
       System.out.println("number: " + number);
              
        // Looping 
              while(number != 0)
                    {  
                        remainder = number % 10;  
                        reverse = reverse * 10 + remainder;  
                        number = number/10;  
                       
                    }  
                        
       /* }
        else
        {
            System.out.println("Enter Only 5-digits number");
        }
          */
          System.out.println("Reverse Digit final: " +reverse);          
    }
}
