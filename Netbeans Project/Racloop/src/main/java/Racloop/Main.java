package Racloop;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     
        float p,r,si;
        int n;
        System.out.println("Enter the value of p, r, n : ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextFloat();
        r = sc.nextFloat();
        n = sc.nextInt();
        si = (p*r*n) /100;
        System.out.println("Simple Interest = Rs. " + si);
        
         }
    
}
