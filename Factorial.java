class Factorial{

static int factorial1(int n)
{
	if(n == 0 || n == 1)
	{
		return 1;
	}
	int factorial = n;
	
	while(n >= 2)
	{
		factorial = factorial * (n-1);
		n--;
	}
	return factorial;
}

public static void main(String [] args)
{
System.out.println(factorial1(4));	
}
}