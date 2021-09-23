package calofsi;
public class ObtainedMarks {
    public static void main(String[] args)
    {
    double english, maths, punjabi, hindi, science, marks, percentage, total_marks;
    english = 90;
    maths = 86.9;
    punjabi = 78.45;
    hindi = 55;
    science = 89.88;
    total_marks = 500;
    
    marks = english + maths + punjabi + hindi + science;
    percentage = (marks * 100 )/total_marks;
    
    System.out.println("\nObtained Marks: "+ marks + "/500");
    System.out.println("\nPercentage: "+ percentage + "%");
    }
}
