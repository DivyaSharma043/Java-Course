package Racloop;
public class Looping {
    public static void main(String[] args)
    {
        int num = 1000;
        for(int i = 0;  i<=num; i++)
        {
            num = num/10;
            System.out.println(num);
        }
       /* if(num <= 1000)
        {
            num = num/10;
            System.out.println(num);
        }*/
    }
}
