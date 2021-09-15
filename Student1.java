class Student1{
	
	
	
	Student1(){}
	void compute(){
		
		int id;
		id = 10;
//INTEGERS 
/*byte age = 39;	
short rank = -139;
long data = 987_717_744_3L;

int minvalue = Integer.MIN_VALUE;
int maxvalue = Integer.MAX_VALUE;*/

// FLOAT

	float gpa = 3.81244431568f;
		double rank = 3.8908907657857890678;
	
	// character
	
	char degree = 'D';
	System.out.println("id : "+id);	
	/*System.out.println("age : "+age);
	
	System.out.println("data : "+data);
	System.out.println("minvalue : "+minvalue);
	System.out.println("maxvalue : "+maxvalue);
	//System.out.println(nextId);	*/
	
	System.out.println("gpa : "+gpa);
	System.out.println("rank : "+rank);
	System.out.println("degree : "+degree);
	}
	
	/*static void primitives(){
		System.out.println("Primtives");
		int intHex = 0x0041;
		System.out.println("intHex : "+intHex);
	}*/
	
	public static void main(String[] args)
	{
		Student1 s = new Student1();
		s.compute();
		//primitives();
	}
}