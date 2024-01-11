package part7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Sofia", 24, 'f', 5, 10.5);
        Student st2 = new Student("Vitalij", 24, 'm', 6, 11.5);
        Student st3 = new Student("Viki", 40, 'f', 12, 15.6);
        Student st4 = new Student("Kate", 20, 'f', 3, 8.7);
        Student st5 = new Student("Micho", 3, 'm', 1, 2.2);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

    /*    students = students.stream().filter(element
                -> element.getAge()>20 && element.getAvgGrade()>10.1).collect(Collectors.toList());

        System.out.println(students);*/

 /*       Stream <Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(el -> el.getAge()>20).collect(Collectors.toList());
        System.out.println(myStream);*/

/*        students = students.stream().sorted((x,y) ->
                x.getName().compareTo(y.getName())
        ).collect(Collectors.toList());
        System.out.println(students);*/

        students.stream().
                map(e -> {e.setName(e.getName().toUpperCase()); return e;}).
                filter(e -> e.getSex() == 'f').
                sorted((x,y) -> x.getAge() - y.getAge()).
                forEach(e -> System.out.println(e));

    }

}

class Student {
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}