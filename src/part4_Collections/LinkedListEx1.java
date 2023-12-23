package part4_Collections;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {

        Student2 stud1 = new Student2("Sofa", 4);
        Student2 stud2 = new Student2("Vitalik", 4);
        Student2 stud3 = new Student2("Katya", 2);
        Student2 stud4 = new Student2("Julia", 2);
        Student2 stud5 = new Student2("Vika", 7);

        LinkedList <Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(stud1);
        student2LinkedList.add(stud2);
        student2LinkedList.add(stud3);
        student2LinkedList.add(stud4);
        student2LinkedList.add(stud5);
        System.out.println("LindedList = " + student2LinkedList);

        Student2 stud6 = new Student2("Anna", 10);
        Student2 stud7 = new Student2("Viki", 1);
        student2LinkedList.add(stud6);
        System.out.println("LindedList = " + student2LinkedList);

        student2LinkedList.add(1,stud7);
        System.out.println("LindedList = " + student2LinkedList);

        student2LinkedList.remove(5);
        System.out.println("LindedList = " + student2LinkedList);



    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}


