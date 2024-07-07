package Inheritance;

public class basics {
    public static void main(String[] args) {
        Student s1 = new Student("Jaswanth", 2);
        System.out.println(s1.getDetails());

        ResearchStudent rs1 = new ResearchStudent("Yaswanth", 3, "AI-ML");
        System.out.println(rs1.getDetails());
    }
}

class Student{
    private final String name;
    protected int year; // year fo study
    // protected: To extend the visibility of the length attribute only to the subclasses
    protected static final int annualFees = 10000;

    public Student (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getDetails(){
        return "Name : "+this.name + '\n' + "Fees : "+this.computeFees() + '\n';
    }

    public float computeFees(){
        return Student.annualFees * this.year;
    }
}

// inheritance
class ResearchStudent extends Student{
    private final String researchArea;

    public ResearchStudent (String name, int year, String researchArea){
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getDetails(){
        return ( super.getDetails() + "researchArea : " + this.researchArea + '\n') ;
    }
}