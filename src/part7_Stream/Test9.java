package part7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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

        List <Integer> age = students.stream().mapToInt(el-> el.getAge()).boxed().collect(Collectors.toList());
        System.out.println(age);

        int sum = students.stream().mapToInt(el->el.getAge()).sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(el-> el.getAge()).average().getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(el-> el.getAge()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el->el.getAge()).max().getAsInt();
        System.out.println(max);


/*        Student min = students.stream().min((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println(min);

        Student max = students.stream().max((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println(max);*/


/*        students.stream().filter(e -> e.getAge()>20).forEach(System.out::println);
        System.out.println("_________________");
        students.stream().filter(e -> e.getAge()>20).limit(2).forEach(System.out::println);
        System.out.println("_________________");
        students.stream().filter(e -> e.getAge()>20).skip(2).forEach(System.out::println);
        System.out.println("_________________");*/
    }
}
