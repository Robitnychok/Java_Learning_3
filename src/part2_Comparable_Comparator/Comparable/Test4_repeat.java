package part2_Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4_repeat {
    public static void main(String[] args) {
        List <Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(2, "S", "K", 10);
        Employee2 emp2 = new Employee2(1, "V", "R", 20);
        list.add(emp1);
        list.add(emp2);

        Collections.sort(list);

        System.out.println(list);
    }
}
class Employee2 implements Comparable <Employee2> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee2 anotherEmp) {
        if (this.id == anotherEmp.id){
            return 0;
        }
        else if (this.id > anotherEmp.id){
            return 1;
        }
        else {
            return -1;
        }
    }


}