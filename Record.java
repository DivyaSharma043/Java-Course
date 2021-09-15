// Constructor Concept
class Record{

static int RecordCount;

int id;
String name;
String gender;
int age;
long phone;
boolean international;
double internationalFee = 12000.0;
double tutionFee = 7000;


// no args constructor
Record(){}

// parameterized Constructor 1 for non international students
Record(int newId, String newName, String newGender, int newAge,long newPhone)
{	
// this() invocation statement means "This"	indicates the same object
this.id = newId;
this.name = newName;
this.gender = newGender;
this.age = newAge;
this.phone = newPhone;

}


// parameterized Constructor 2
Record(int Id, String Name, String Gender, int Age,long Phone, boolean International)
{
	this.id = Id;
	this.name = Name.toUpperCase();
	this.gender = Gender;
	this.age = Age;
	this.phone = Phone;
	this.international = International;
	RecordCount = RecordCount + 1;
	
	if (International){
	tutionFee = tutionFee + internationalFee;	
	}
	
	

}
// main function
public static void main(String[] args){

Record r = new Record(1043, "Divya", "Female", 24 , 9877177443L);
//System.out.println("\nRecordCount: " + RecordCount);	
System.out.println("Id: " + r.id);
System.out.println("Name: " + r.name);
System.out.println("Gender: " + r.gender);
System.out.println("Age: " + r.age);
System.out.println("Phone: " + r.phone);
Record r1 = new Record(1044, "Ashish", "Male", 20 , 9822177443L, true);
//System.out.println("\nRecordCount: " + RecordCount);	
System.out.println("Id: " + r1.id);
System.out.println("Name: " + r1.name);
System.out.println("Gender: " + r1.gender);
System.out.println("Age: " + r1.age);
System.out.println("Phone: " + r1.phone);
Record r2 = new Record(1045, "Gourav", "Male", 27 , 1234177443L);
//System.out.println("\nName of Student: " + r.Name);
}
}
 