package Racloop;
import java.util.*;
public class InterChange {
    public static void main(String[] args) 
    {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the value of a: ");
    a = sc.nextInt();
    System.out.println("Enter the value of b: ");
    b = sc.nextInt();
    
    a = a+b;
    b = a-b;
    a = a-b;
    
    System.out.println("value of a: "+ a);
    System.out.println("value of b: "+ b);
    
    
    
    
    }
}
