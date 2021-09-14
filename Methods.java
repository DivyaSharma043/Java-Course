public class Methods{

// sum method
static double sum(double x , double y){
return x + y;
}

// avg method

static double avg(double x, double y){
double sum = sum(x,y);
return sum/2;
}

// for passing array

static boolean search(int[] list, int key){
return true;	
}



// main Function
public static void main(String [] args){


// sum 
double s = sum(3.0 , 5.0);
System.out.println(s);

// avg

double d1 = avg(3.0, 5.0);
System.out.println(d1);

// array
int[] list = {2,5,7};
System.out.println(search(list,2));
}
}