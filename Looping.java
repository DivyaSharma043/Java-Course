class Looping{

static void looping(){
	
	System.out.println("\n forward counting");
	int array [] = {1,2,3,4,5,6,7,8,9};
	
for(int i = 0 ; i < array.length ;System.out.println(array[i]), i++)
{
	//System.out.println(array[i]);
}

System.out.println("\n reverse counting");
for(int i = array.length-1; i >=0; i--)
{

	System.out.println(array[i]);
}

System.out.println("\n divisor counting");
int x = 388;
int count = 0;
for(int i = 1; i <= x; i++)
{
	if(x % i ==0){
		System.out.println(i + "   ");
		count++;
	}
}
System.out.println("\nDivisor count :" + count);
}
public static void main(String[] args) {
looping();
}
}