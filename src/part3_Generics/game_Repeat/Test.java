package part3_Generics.game_Repeat;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Io", "Oi", 1);
        Schoolar  schoolar22 = new Schoolar("Legion", "Comander", 25);

        Student student1 = new Student("Primal", "Beast", 24);
        Student student2 = new Student("Phantom", "Assasian", 24);
        Student student3 = new Student("Axe", "Red", 40);
        Student student4 = new Student("Invo", "Ker", 32);



        Employee employee1 = new Employee("Wrise", "King", 1234567890);
        Employee employee2 = new Employee("Trent","Protector", 101);

        Team <Schoolar> team1 = new Team<>("123");
        team1.addNewPart(schoolar1);
        team1.addNewPart(schoolar22);

        Team <Student> team2 = new Team<>("Raki");
        team2.addNewPart(student1);
        team2.addNewPart(student3);

        Team <Student> team4 = new Team<>("Zeskij kat");
        team2.addNewPart(student2);
        team2.addNewPart(student4);

        Team <Employee> team3 = new Team<>("213");
        team3.addNewPart(employee1);
        team3.addNewPart(employee2);

        team2.teamWinner(team4);
        for (int i = 0; i < 20; i++) {
            team2.teamWinner(team4);
        }


    }
}
