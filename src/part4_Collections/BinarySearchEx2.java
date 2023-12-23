package part4_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchEx2 {
    public static void main(String[] args) {

        Employee3 emp1 = new Employee3(1, "A", 10);
        Employee3 emp2 = new Employee3(16, "T", 54);
        Employee3 emp3 = new Employee3(6, "I", 435);
        Employee3 emp4 = new Employee3(58, "K", 685);
        Employee3 emp5 = new Employee3(86, "PL", 8484);
        Employee3 emp6 = new Employee3(1, "HJ", 478);
        Employee3 emp7 = new Employee3(87, "RT", 59);

        List<Employee3> list =    new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);

        int index2 = Collections.binarySearch(list, new Employee3( 86, "PL", 8484));
        System.out.println(index2);

    }
}

class Employee3 implements Comparable<Employee3>{
    int id;
    String name;
    int salary;

    public Employee3(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee3 o) {

       /* if (this.id > o.id) {
            return  1;
        } else if ( this.id == o.id){
            return  0;
        } else{
        return-1;
        }*/

        int result = this.id - o.id;
        if (result == 0){
            result = this.name .compareTo(o.name);
        }
        return result;
    }

}