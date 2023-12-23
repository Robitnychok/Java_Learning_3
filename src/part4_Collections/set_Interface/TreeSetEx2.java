package part4_Collections.set_Interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet <Student> treeSet = new TreeSet<>();
        Student student1 = new Student("S", 1);
        Student student2 = new Student("V", 2);
        Student student3 = new Student("K", 5);
        Student student4 = new Student("A", 3);
        Student student5 = new Student("N", 4);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student student6 = new Student("C", 3);
        Student student7 = new Student("Q", 3);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.subSet(student6,student7));

        Student student8 = new Student("Q", 5);
        System.out.println(student8.equals(student7));
        System.out.println(student8.hashCode());
        System.out.println(student7.hashCode());

    }
}

class Student implements Comparable <Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}