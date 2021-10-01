package ClassesAndObjectsProject;
import java.util.*;
public class ArrayOfStrings {

        public static void main(String[] args)
        {
            String[] masterlist = {"Divya", "Ashish", "Putul", "Shabu", "Sourav"};
            
            String yourName;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            yourName = sc.nextLine();
            
            int i, a;
            boolean flag = false;
            for(i = 0; i < 5; i++)
            {
                a = masterlist[i].compareTo(yourName);
                if(a==0)
                {
                    System.out.println("You can enter the palace "+ yourName);
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.printf("Sorry, %s you are a trespasser", yourName);
            }
            
            // Sorting the string
            
            int b, result;
            String temp;
            
            for(i =0; i <=masterlist.length-1;i++)
            {
                for(b = i+1; b <=masterlist.length-1;b++)
                {
                result = masterlist[i].compareTo(masterlist[b]);
                if (result >0)
                {
                    temp = masterlist[i];
                    masterlist[i] = masterlist[b];
                    masterlist[b]=temp;
                }
                }
            }
            System.out.println("Sorted List: ");
            for(String n : masterlist)
                
                System.out.println(n);
            
            }
}
     