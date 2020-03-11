import java.util.Arrays;

public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return Student + " is in " + grade + "th grade and is enrolled in the following sections: "
                + sections + "(" + Teacher + ")";
    }
}
