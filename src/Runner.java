public class Runner {

    public static void main(String[] args){
        School bhs = new School("Berkeley High");
        Section m = new Section("math", 6, "Albrecht");
        Section b = new Section("biology", 6, "Mueller");
        Section cs = new Section("comp sci", 6, "Albinson");
        Teacher math = new Teacher("Albrecht", 6, "Math");
        Teacher bio = new Teacher("Mueller", 6, "Biology");
        Teacher comp = new Teacher("Albinson", 6, "Comp Sci");
        Student one = new Student("Huaerzeng", 11);
        Student two = new Student("Emmett", 11);
        Student three = new Student("Soroosh", 11);
        Student four = new Student("Lucas", 11);
        Student five = new Student("Noam", 11);
        Student six = new Student("Andrew", 11);
    }

}
