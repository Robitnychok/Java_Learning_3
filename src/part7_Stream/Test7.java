package part7_Stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Sofia", 24, 'f', 5, 10.5);
        Student st2 = new Student("Vitalij", 24, 'm', 6, 11.5);
        Student st3 = new Student("Viki", 40, 'f', 12, 15.6);
        Student st4 = new Student("Kate", 20, 'f', 3, 8.7);
        Student st5 = new Student("Micho", 3, 'm', 1, 2.2);

        Faculty faculty1 = new Faculty("Gryffindor");
        Faculty faculty2 = new Faculty("Slytherin");
        Faculty faculty3 = new Faculty("Ravenclaw ");
        Faculty faculty4 = new Faculty("Hufflepuff");

        faculty1.addStudToFaculty(st1);
        faculty1.addStudToFaculty(st2);
        faculty1.addStudToFaculty(st3);
        faculty3.addStudToFaculty(st4);
        faculty3.addStudToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty3);
        facultyList.stream().flatMap(faculty ->
                faculty.getStudentsOfFaculty().stream()).forEach(e -> System.out.println(e.getName()));

    }
}

class Faculty{
    String name;
    List<Student> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }

    public void addStudToFaculty(Student st){
        studentsOfFaculty.add(st);
    }
}