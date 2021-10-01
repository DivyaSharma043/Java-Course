package ClassesAndObjectsProject;
import java.util.*;

/*

1-> This program contain 2 classes : Main class , Rectangle class
2-> 2 data items: Len(Length), Brd(Breadth)<----- KNOWN AS DATA MEMBERS
3-> 4 functions: getData(), setData(), displayData(), areaPerimeter()<---- KNOWN AS MEMBER FUNCTIONS / METHODS
4-> Private the data member ...Cannot be accessed directly from outside the Rectangle Class / Only member functions of rectangle class access the private data members
5-> Public the member function ... Access the member functions outside the rectangle class along with this get the permission to access the private data members
6-> Objects created bcz to store the values in r1, r2 , r3
7-> Use the objects to call the member functions
8-> OBJECTS created at a place in memory called HEAP
9-> REFRENCES created at a place in memory called STACK

*/

// CLASS 2
class Rectangle
{
    private int len, brd;
    
    
    // Sets the data item to values passed to it
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length & breadth: ");
        len = sc.nextInt();
        brd = sc.nextInt();
    }
    
    // Recieves the value of data items
    public void setData(int l, int b)
    {
        len = l;
        brd = b;
    }
    
    
    // Display these values
    public void displayData()
    {
        System.out.println("Length= " + len);
        System.out.println("Breadth= " + brd);
    }
    
    
    // Calculates & Prints the area & perimeter
    public void areaPerimeter()
    {
        int a, p;
        a = len * brd;
        p = 2*(len + brd);
        System.out.println("Area= " + a);
        System.out.println("Perimeter= " + p);
    }
}

// Class 1
public class Main 
{
    public static void main(String[] args) 
        {
            Rectangle r1,r2,r3;  //define 3 refrences
            
            r1 = new Rectangle();
            r2 = new Rectangle();
            r3 = new Rectangle();
            
            r1.getData(); // get data in elements of the object
            r1.displayData(); //display the data set by setData()
            r1.areaPerimeter(); // Calculate and print area & premimeter
            
            r2.setData(20, 30); // set data in elements of the object
            r2.displayData(); //display the data set by setData()
            r2.areaPerimeter(); // Calculate and print area & premimeter
            
            r3.setData(30, 40); // set data in elements of the object
            r3.displayData(); //display the data set by setData()
            r3.areaPerimeter(); // Calculate and print area & premimeter
            
                    
        }
    
}
