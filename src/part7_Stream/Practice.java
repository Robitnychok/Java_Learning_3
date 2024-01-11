package part7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        Person p1 = new Person("So", 24, 'f');
        Person p2 = new Person("Vi", 24, 'm');
        Person p3 = new Person("Vik", 45, 'f');
        Person p4 = new Person("Ka", 20, 'f');
        List <Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        //personList.stream().filter(e -> e.getAge()>20).forEach(e-> System.out.println(e));
        //personList.stream().sorted((x,y)-> x.getName().compareTo(y.getName())).forEach(e-> System.out.println(e));

/*        Нахождение среднего возраста:
        Используйте Java Stream API для нахождения среднего возраста всех людей в списке.*/

        //double age = personList.stream().flatMapToInt(e-> IntStream.of(e.getAge())).average().getAsDouble();
        //System.out.println(age);

    }

}

class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}