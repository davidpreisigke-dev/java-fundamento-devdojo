package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.domain;

import java.lang.module.FindException;
import java.time.LocalTime;

public class Seminar {

    private String title;
    private String location;
    private LocalTime hour;
    public Teacher teacher;
    public Student[] students;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public Seminar(String title, String location, LocalTime hour) {

        this.title = title;
        this.location = location;
        this.hour = hour;

    }

    public void printer() {

        System.out.println("Title : " + this.title);
        System.out.println("Address : " + this.location);
        System.out.println("Hour : " + this.hour + " Hrs");
        System.out.println("Speaker : " + this.teacher.getName() + this.teacher.getSpecialty());
        if (students != null) {
            for (Student student : students) {
                System.out.println("Student: " + student.getName());
            }
        }


    }

}
