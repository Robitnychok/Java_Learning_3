package part4_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        Student student1 = new Student("Sofia", "f", 24);
        Student student2 = new Student("Vitalij", "m", 24);
        Student student3 = new Student("Julia", "f", 24);
        Student student4 = new Student("Katya", "f", 20);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println(studentList);


        Student student5 = new Student("Katya", "f", 20);

        studentList.remove(student5);
        System.out.println(studentList);

    }
}

class Student {
    String name;
    String sex;
    int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

}