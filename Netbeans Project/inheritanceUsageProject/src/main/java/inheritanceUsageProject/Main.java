package inheritanceUsageProject;
// BASE CLASS

class Index
{
    protected int count;
    
    public Index()
    {
        count = 0;
    }
    public void display()
    {
       System.out.println("count = "+ count); 
    }
    public void increment()
    {
        count += 1;
        
    }
}
    
// DERIVED CLASS
    class Index1 extends Index
    {
        public void decrement()
        {
        count -=1;
        }
    }
    


public class Main {

    public static void main(String[] args) {
        
        Index1 i = new Index1();
        i.increment();
        i.display();
        i.decrement();
        i.display();
    }

      
}
