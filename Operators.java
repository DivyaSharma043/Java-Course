class Operators{


static void preAndPost(){
  int x = 10;
  int a = 30;
  System.out.println(" -----Pre & Post------");
  // post increment
  x++;
  System.out.println("\nx: "+ x);
  
  int y = x++;
  System.out.println("\nx: " + x);
  System.out.println("\ny: " + y);
  
  // pre increment
  --a;
  System.out.println("\na : "+ a);

	int b = --a;
	System.out.println("\na: " + a);
	System.out.println("\nb: " + b);

}

//  compound arithmetic assignment

static void caa(){

int c = 200;
System.out.println(" ------Compound Arithmetic Assignment------");
System.out.println("\nc += 20: " + (c +=20));
System.out.println("\nc -= 20: " + (c -=20));
System.out.println("\nc *= 20: " + (c *=20));
System.out.println("\nc /= 20: " + (c /=20));
System.out.println("\nc %= 20: " + (c %=20));
}

// using modulus 

static void isOddOrEven(int number)
{
	if (number % 2 == 0)
	{
		System.out.println("\n" + number + " number is even");		
	}	
	else
	{
		System.out.println("\n" + number + " number is odd");
	}
}

// char type

static void charTypePromotion()
{
	char char1 = 22;
	System.out.println("char1 : " + char1);
	System.out.println("73 - char1 :" + (73 - char1));
	System.out.println("char1 - '3' :" + (char1 - '3'));
	System.out.println("'A' + 'B' :" + ('A' + 'B'));
	System.out.println("9 * 5 - 'a' / 5.0 : " + (9 * 5 - 'a' / 5.0));
	
}
public static void main(String[] args){
	
	preAndPost();
	caa();
	isOddOrEven(57);
	charTypePromotion();
}
}