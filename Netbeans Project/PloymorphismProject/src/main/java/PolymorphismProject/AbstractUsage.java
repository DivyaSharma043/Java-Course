package PolymorphismProject;

abstract class Printer
{
    protected String name;
    public Printer(String n)
    {
        name = n;
    }
    
    public abstract void print(String docName);
}

class LaserPrinter extends Printer
{
    public LaserPrinter(String n)
    {
        super(n);
        
    }
    public void print(String docName)
    {
        System.out.println("Laser Printer");
    }
}


class InkjetPrinter extends Printer
{
        public InkjetPrinter(String n)
    {
        super(n);
        
    }
    public void print(String docName)
    {
        System.out.println("Inkjet Printer");
    }
}
public class AbstractUsage {
    
    public static void main(String[] args)
    {
        Printer p = new LaserPrinter("LaserJet 1100");
        p.print(" Hello ");
        p = new InkjetPrinter("IBM 2140");
        p.print("Hello bro!");
    }
}
