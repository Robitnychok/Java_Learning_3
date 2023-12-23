package part2_Comparable_Comparator.Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee(12, "Sofia", "K", 100000);
        Employee emp2 = new Employee(12, "Vitalij", "R", 15000);

        list.add(emp1);
        list.add(emp2);

        System.out.println("Before sorting \n"+ list);

        Collections.sort(list);

        System.out.println("After sorting \n"+ list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        /*if (this.id == anotherEmp.id){
            return 0;
        }
        else if (this.id > anotherEmp.id){
            return 1;
        }
        else {
            return -1;
        }*/

         int result =  this.id-anotherEmp.id;

        if (this.id-anotherEmp.id == 0){
            result = this.salary-anotherEmp.salary;
        }
        return result;
    }
}
