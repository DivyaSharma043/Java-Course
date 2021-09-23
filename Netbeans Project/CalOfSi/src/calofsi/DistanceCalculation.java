package calofsi;
public class DistanceCalculation {

    public static void main(String[] args)
    {
        int  x1, x2, y1, y2, d1, d2;
        float d;
        x1 = 23;
        x2 = 34;
        y1 = 45;
        y2 = 66;
        d1 = (x2-x1)*(x2-x1);
        d2 = (y2-y1)*(y2-y1);
        d = (d1+d2)* 0.5f;
        System.out.println("d1: "+ d1);
        System.out.println("d2: "+ d2);
        System.out.println("distance between 2 cities: "+ d);
    }
}
