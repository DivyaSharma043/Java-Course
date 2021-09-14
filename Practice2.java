public class Practice2{

int id = 403;
String name = "Divya";
String gender = "Female";

void Practice2 (){

System.out.println("ID : " + id);
System.out.println("NAME : " + name);
System.out.println("GENDER : " + gender);

}

public static void main(String [] args){
Practice2 p = new Practice2();
p.Practice2();
}}

class Rough{
	static void rough(){
		System.out.println("It's Working Correctly");
		//System.out.println("ID : " +id);
	}
public static void main(String[] args){
Rough r = new Rough();
r.rough();
}	
}


// ARRAY - How to create array in java

class Array{

static void arrays(){
	System.out.println("\nInside arrays...");
	int scores[] = new int[] {10, 20, 30, 40, 50};
	
	/*scores[0] = 10;
	scores[1] = 20;
	scores[2] = 40;
	scores[3] = 70;
	scores[4] = 90;*/
	
	System.out.println("Mid-Term 1: " + scores[0]);
	System.out.println("Mid-Term 2: " + scores[1]);
	System.out.println("Mid-Term 3: " + scores[2]);
	System.out.println("Mid-Term 4: " + scores[3]);
	System.out.println("Mid-Term 5: " + scores[4]);
	
	
// String array
System.out.println("\nInside String arrays...");
	String names[] = new String[5];
	
	names[0] = "Divya";
	names[1] = "Arsh";
	names[2] = "Mehak";
	names[3] = "Shitu";
	names[4] = "Saksham";
	
	System.out.println("Mid-Term 1: " + names[0]);
	System.out.println("Mid-Term 2: " + names[1]);
	System.out.println("Mid-Term 3: " + names[2]);
	System.out.println("Mid-Term 4: " + names[3]);
	System.out.println("Mid-Term 5: " + names[4]);
	System.out.println("# total: " + names.length);
	
	//2D Array
	
		
	int [] [] myarray = new int[5][2];
	myarray[0][0] = 23;
	myarray[1][0] = 21;
	myarray[0][1] = 20;
	myarray[1][1] = 25;
	myarray[2][0] = 29;
	myarray[2][1] = 34;
	
	System.out.println("Mid-Term 1: " + myarray[0][0]);
	System.out.println("Mid-Term 2: " + myarray[1][0]);
	System.out.println("Mid-Term 3: " + myarray[0][1]);
	System.out.println("Mid-Term 4: " + myarray[1][1]);
	System.out.println("Mid-Term 5: " + myarray[2][0]);
	System.out.println("Mid-Term 6: " + myarray[2][1]);
	System.out.println("# total: " + myarray.length);
	
	
	
	// Method
	
	
}
static double sum(double x, double y){
		return x + y ;
	}
	
	// array
static void go(int[] array)
{
	System.out.println("array[0]: "+ array[0]);
	System.out.println("array[1]: "+ array[1]);
	array[1] = 22;

}


//overloading concept

static void go(int i)
{
	System.out.println("go(int i)");
	}

static void go(short s)
{
	System.out.println("go(short s)");
	}

//varargs

static void varargsOverload(boolean b, int i, int j, int k){
	   System.out.println("\nInside varargsOverload without varargs ...");
	}
	static void varargsOverload(boolean b, int... list){
	   System.out.println("\nInside varargsOverload with varargs ...");
	   System.out.println("list.length: " + list.length);
	}
	
public static void main(String[] args){
	arrays();
double d = sum(3.0, 2.0);
System.out.println(d);

int[] array = {1,2};
go(array);
System.out.println("array[1]: "+ array[1]);
// overloading

go(1000);
byte b = 22;
go(b);


//varargs
varargsOverload(true, 1, 2, 3);
      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);	  
      varargsOverload(true);
}
}