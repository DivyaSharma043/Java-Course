class RecordTest{
public static void main(String[] args){
	
	// 1st record
Record r = new Record(1043, "Divya", "Female", 24 , 9877177443L);	
System.out.println("\nId: " + r.id);
System.out.println("Name: " + r.name);
System.out.println("Gender: " + r.gender);
System.out.println("Age: " + r.age);
System.out.println("Phone: " + r.phone);

//2nd record
Record r1 = new Record(1044, "Ashish", "Male", 20 , 9822177443L, true);	
System.out.println("\nId: " + r1.id);
System.out.println("Name: " + r1.name);
System.out.println("Gender: " + r1.gender);
System.out.println("Age: " + r1.age);
System.out.println("Phone: " + r1.phone);

//3rd record
Record r2 = new Record(1045, "Gourav", "Male", 27 , 1234177443L);
System.out.println("\nId: " + r2.id);
System.out.println("Name: " + r2.name);
System.out.println("Gender: " + r2.gender);
System.out.println("Age: " + r2.age);
System.out.println("Phone: " + r2.phone);

//4th record
Record r3 = new Record(1046, "Shabhnam", "Female", 23 , 4567177443L, true);
System.out.println("\nId: " + r3.id);
System.out.println("Name: " + r3.name);
System.out.println("Gender: " + r3.gender);
System.out.println("Age: " + r3.age);
System.out.println("Phone: " + r3.phone);


// swapping
Record [] Records = {r,r1,r2,r3};
Record temp = Records[0];
Records[0] = Records[2];
Records[2] = temp;
temp = Records[1];
Records[1] = Records[3];
Records[3] = temp;

System.out.println("\n-----------Updated Names-----------");
System.out.println("\nOld Name: " + r.name);
System.out.println("Updated Name: " + Records[0].name);
System.out.println("\nOld Name: " + r1.name);
System.out.println("Updated Name: " + Records[1].name);
System.out.println("\nOld Name: " + r2.name);
System.out.println("Updated Name: " + Records[2].name);
System.out.println("\nOld Name: " + r3.name);
System.out.println("Updated Name: " + Records[3].name);
}
}