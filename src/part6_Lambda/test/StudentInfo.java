package part6_Lambda.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents (ArrayList<Student> al, Predicate<Student> pr){
            for( Student s : al){
                if(pr.test(s)){
                    System.out.println(s);
                }
            }
    }

    /*void printStudentsOverGrade (ArrayList <Student> arrayList, double grade){
            for (Student s: arrayList){
                if (s.avrGrade> grade){
                    System.out.println("1" + s);
                }
            }
    }
    void printStudentsUnderAge (ArrayList<Student> arrayList, int age){
            for (Student s: arrayList){
                if (s.age< age){
                    System.out.println("2" + s);
                }
            }
    }
    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex){
            for (Student s: arrayList){
                if (s.age > age && s.avrGrade< grade && s.sex == sex){
                    System.out.println("3" + s);
                }
            }
    }*/
}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Sofia", 'f', 24, 5, 8.5);
        Student st2 = new Student("Vitalij", 'm', 24, 5, 7.5);
        Student st3 = new Student("Katya", 'f', 20, 3, 9.5);
        Student st4 = new Student("Anna", 'f', 29, 1, 6.5);
        Student st5 = new Student("Viki", 'f', 27, 2, 5.5);

        ArrayList <Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course;
            }
        });
        System.out.println(students);

        Collections.sort(students, (Student o1, Student o2)-> {return o1.course-o2.course;});
        System.out.println(students);

        Collections.sort(students, (stud1, stud2)-> stud1.age-stud2.age);
        System.out.println(students);

        /*StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<24;
            }
        });*/

        /*StudentInfo info = new StudentInfo();
        info.testStudents(students, (Student s) -> {return s.age<24;});
        info.testStudents(students, (Student s) -> {return s.sex == 'm';});
        info.testStudents(students, (Student s) -> {return s.avrGrade<6;});
        info.testStudents(students, s -> s.avrGrade<6);*/

//        StudentInfo info = new StudentInfo();
//        info.printStudentsOverGrade(students, 8.0);
//        info.printStudentsUnderAge(students, 28);
//        info.printStudentsMixCondition(students,25,7,'f');
    }
}

interface StudentChecks{
    boolean check (Student s);
}

class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student s) {
        return s.avrGrade>8;
    }
}