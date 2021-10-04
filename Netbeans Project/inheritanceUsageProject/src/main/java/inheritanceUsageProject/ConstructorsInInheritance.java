package inheritanceUsageProject;

class a
{
    public a()
    {
        System.out.println("a's 0-arg Constructor");
    }
    public a(int xx)
    {
        System.out.println("a's 1-arg Constructor");
    }
}

class b extends a
{
    public b()
    {
        System.out.println("b's 0-arg Constructor");
    }
    public b(int xx)
    {
        super(xx);
        System.out.println("b's 1-arg Constructor");
    }
}
public class ConstructorsInInheritance {
    public static void main(String[] args)
    {
        b y = new b();
        b z = new b(10);
    }
    
}
