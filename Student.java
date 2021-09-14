class Student{
// variable declaration
int ID;
String NAME;
String GENDER;

//Method declaration
Boolean UpdateProfile(String NewName){
NAME = NewName;
return true;
}}

// student test
class StudentTest{
public static void main(String[] args){
 //1. Creating new student
 Student s = new Student();
 // assign values to state
 s.ID = 1000;
 s.NAME = "Joan";
 s.GENDER = "Male";

 
 // updating profile
 s.UpdateProfile("John");
 }}