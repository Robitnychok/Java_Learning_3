package part2_Comparable_Comparator.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Employee3> list = new ArrayList<>();

        Employee3 emp1 = new Employee3(2, "S", "K", 10);
        Employee3 emp2 = new Employee3(1, "V", "R", 20);
        list.add(emp1);
        list.add(emp2);

        Collections.sort(list, new salaryComparator()); //тут может быть нью nameComparator
                                                         // or   idComparator

        System.out.println(list);
    }
}

class Employee3 {
    int id;
    String name;
    String surname;
    int salary;

    public Employee3(int id, String name, String surname, int salary) {
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

}

class idComparator implements Comparator <Employee3> {

    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        if (emp1.id == emp2.id){
            return 0;
        } else if (emp1.id > emp2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

class nameComparator implements Comparator <Employee3> {

    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator <Employee3> {

    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.salary - emp2.salary;
    }
}