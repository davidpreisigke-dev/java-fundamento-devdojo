package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.domain.Seminar;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.domain.Student;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.domain.Teacher;

import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {


        Teacher oliver = new Teacher("Oliver", 37, " Developer");
        Seminar seminarJava = new Seminar("Learning Java Like a Ninja", "London", LocalTime.of(19, 00));
        Student student2 = new Student("Jhon", 21, seminarJava);
        Student student1 = new Student("David", 19);
        Student[] students = {student2,student1};

        seminarJava.setStudents(students);
        seminarJava.setTeacher(oliver);


        student2.printer();
}}
