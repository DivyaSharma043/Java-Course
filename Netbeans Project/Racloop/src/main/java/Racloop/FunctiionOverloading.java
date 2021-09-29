package Racloop;
public class FunctiionOverloading {
   
    public static void main(String[] args)
    {
            int i = -23,j;
            long l = -12834348, m ;
            double d = -233.22,e;
            
            j = abs(i);
            m = abs(l);
            e = abs(d);
            
            System.out.println("j:"+j + "  m:"+m+ "  e:"+e);
    }
    
    static int abs(int i1)
    {
        return(i1>0 ? i1:i1*-1);
    }
    static long abs(long l1)
    {
        return(l1>0 ? l1:l1*-1);
    }
    static double abs(double d1)
    {
        return(d1>0 ? d1:d1*-1);
    }
}
