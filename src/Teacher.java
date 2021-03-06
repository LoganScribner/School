import java.util.Arrays;

public class Teacher extends Person{

    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, int id, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    @Override
    public String toString() {
        return "Teacher" + Teacher +
                " teaches the following sections: " + Arrays.toString(sections) + "(" + sectionCount + ")";
    }
}
