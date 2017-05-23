package Java2;


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return (sum / this.grades.size());
    }

    public static void main(String[] args) {
        Student james = new Student("James");

        james.addGrade(50);
        james.addGrade(100);
        james.addGrade(100);
        james.addGrade(85);

        System.out.println("Here is James Avg Grade " + james.getGradeAverage());

    }
}

