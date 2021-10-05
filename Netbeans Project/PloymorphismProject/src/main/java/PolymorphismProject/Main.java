package PolymorphismProject;

abstract class One
{
    public void display()
   {
        System.out.println("The base class");
   }
}

class OneOfOne extends One
{
    public void display()
    {
        System.out.println("The OneOfOne class");
    }
}

class TwoOfOne extends One
{
    public void display()
    {
        System.out.println("The TwoOfOne class");
    }
}
public class Main {
    public static void main(String[] args) {
        One ptr; // ptr is just a declaring varible name
        OneOfOne o1 = new OneOfOne();
        TwoOfOne o2 = new TwoOfOne();
        ptr = o1;
        ptr.display();
        ptr = o2;
        ptr.display();
    }
    
}
