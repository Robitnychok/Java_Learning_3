package part7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

/*        Map<Integer, List<Student>> map = students.stream().map(el -> {el.setName(el.getName().toUpperCase());return el;})
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for(Map.Entry <Integer, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }*/

        Map <Boolean, List<Student>> map = students.stream().collect(Collectors
                .partitioningBy(e -> e.getAvgGrade()>10));

        for(Map.Entry<Boolean, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue().toString());
        }
    }
}
