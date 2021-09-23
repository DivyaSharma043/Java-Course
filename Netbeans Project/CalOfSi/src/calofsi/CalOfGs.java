package calofsi;
public class CalOfGs {
    public static void main(String[] args)
    {
        float basic_salary, allowance, house_rent, gross_salary;
        basic_salary = 21000.00f;
        allowance = 0.4f;
        house_rent = 0.2f;
        gross_salary = basic_salary * allowance + basic_salary * house_rent;
        System.out.println("Gross Salary: "+ gross_salary);
    }
}
