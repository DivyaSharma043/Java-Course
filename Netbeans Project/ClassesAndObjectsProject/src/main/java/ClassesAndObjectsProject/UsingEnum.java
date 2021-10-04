package ClassesAndObjectsProject;
    
enum Department
            {
               assembly,manufacturing, accounts, stores 
            }
    
class Employee 
{
    private String name;
    private int age;
    private float salary;
    private Department dept;
    
    public Employee(String n, int a, float s, Department d)
    {
        name =n;
        age = a;
        salary = s;
        dept = d;
    }
    
    
    public void displayData()
    {
        System.out.println(name+ " "+ age + " "+ salary + " "+ dept + " ");
            if(dept==Department.accounts)
                System.out.println(name+ " is an accountant\n");
            else
                System.out.println(name+ " is not an accountant\n");
    }

}

public class UsingEnum
{
        public static void main(String[] args)
        {
            Employee e = new Employee("Divya Sharma", 24, 2345.78f, Department.manufacturing);
            Employee a = new Employee("Ashish Sharma", 20, 122345.78f, Department.accounts);
            e.displayData();
            a.displayData();
            System.out.println("INDEX OF DEPARTMENTS: "+Department.accounts.ordinal());
            
            System.out.println("Department names & their values");
            for(Department de : Department.values())
                System.out.println(de + " = " +de.ordinal());
            
        }

}