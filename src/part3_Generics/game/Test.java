package part3_Generics.game;

public class Test {
    public static void main(String[] args) {

        Scholar scholar1 = new Scholar("Ivo", 15);
        Scholar scholar2 = new Scholar("Io", 16);

        Employee employee1 = new Employee("Kola", 30);
        Employee employee2 = new Employee("Koa", 35);

        Student student1 = new Student("Neo", 19);
        Student student2 = new Student("No", 21);

        Team <Scholar> schoolarTeam = new Team("Primary");
        schoolarTeam.AddNewParticipant(scholar1);
        schoolarTeam.AddNewParticipant(scholar2);

        Team <Employee> employeeTeam = new Team("Start-up");
        employeeTeam.AddNewParticipant(employee1);
        employeeTeam.AddNewParticipant(employee2);

        Team <Student> studentTeam = new Team("Newbee");
        studentTeam.AddNewParticipant(student2);
        studentTeam.AddNewParticipant(student1);
    }
}
