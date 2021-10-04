package inheritanceUsageProject;

class Base
{
    protected int i;
    
  public Base()
    {
        i =4;
        System.out.println(i);
    }
    
    
}

class Derived extends Base
{
    private int j;
    
    public Derived()
    {
        j = i *4;
        System.out.println(j);
    }
   
    public void Base()
    {
        System.out.println("Hello");
    }
}
public class OrderOfConstruction {
    
    public static void main(String[] args)
    {
        Derived d = new Derived();
        //System.out.println(d.j);
        System.out.println(d.i);
         d.Base();
        
    }
    
}
