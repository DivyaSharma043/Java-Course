package calofsi;
public class AreaCalculation {
    public static void main(String[] args)
    {
        double l, b, r, aor, por, aoc, coc;
        l = 23;
        b = 45;
        r = 4;
        aor = l * b;
        por = 2*(l + b);
        aoc = 3.14 * r * r;
        coc = 2 * 3.14 * r;
        System.out.println("Area of rectangle: "+ aor + " cm");
        System.out.println("Perimeter of rectangle: "+ por + " cm");
        System.out.println("Area of circle: "+ aoc + " cm");
        System.out.println("Circumference of circle: "+ coc + " cm");
    }
}
