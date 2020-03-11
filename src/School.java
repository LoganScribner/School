public class School {

    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(Section[] sections) {
        this.sections = sections;
    }

    public School(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "The school named " + name + " has " + sectionCount + " sections.";
    }
}
