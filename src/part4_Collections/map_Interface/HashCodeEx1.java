package part4_Collections.map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {

        Map<Studentik, Double> map = new HashMap<>();
        Studentik st1 = new Studentik("Sofia", "Rudenko", 1);
        Studentik st2 = new Studentik("Vitalij", "Rudenko", 4);
        Studentik st3 = new Studentik("Katya", "Mac", 2);

        map.put(st1, 3.2);
        map.put(st2, 8.2);
        map.put(st3, 1.2);
        System.out.println(map);

        Studentik st4 = new Studentik("Sofia", "Rudenko", 1);
        /*boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.equals(st4));*/

        System.out.println(st4.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st1.equals(st4));

        for (Map.Entry <Studentik, Double> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }

    }
}

class Studentik implements Comparable<Studentik>{
    String name;
    String surname;
    int course;

    public Studentik(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Studentik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentik studentik = (Studentik) o;
        return course == studentik.course && Objects.equals(name, studentik.name)
                && Objects.equals(surname, studentik.surname);

    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }


    @Override
    public int compareTo(Studentik o) {
        return this.name.compareTo(o.name);
    }
}