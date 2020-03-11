import java.util.Arrays;

public class Section {

    private String name;
    private Student[] students = new Student[50];
    private Teacher teacher;
    private int currentSize;

    public Section(String name, int currentSize, String teacher){
        this.name = name;
        this.currentSize = currentSize;


    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }


    @Override
    public String toString() {
        return name + " is taught by " + teacher +
                " and has " + currentSize + " students: " + writeStudents();
    }

    public String writeStudents() {
        String o = "";

        for(int i=0; i<currentSize;i++) {
            o += students[i].getName() + ",  ";
        }

        return o;
    }

}
