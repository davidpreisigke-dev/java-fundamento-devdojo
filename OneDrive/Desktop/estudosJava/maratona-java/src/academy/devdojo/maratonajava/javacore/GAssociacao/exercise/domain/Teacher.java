package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.domain;

public class Teacher {

    private int age;
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, int age, String specialty){
        this.age = age;
        this.specialty = specialty;
        this.name = name;

    }

    public void printer(){

        System.out.println(this.age);
        System.out.println(this.specialty);
        System.out.println(this.name);

        if (seminars == null)return;
        for (Seminar seminar : seminars) {
            seminar.printer();
        }

    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
