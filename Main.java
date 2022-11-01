import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Group group = new Group(new ArrayList<Student>(), "704");
        group.addStudent(new Student(1, "Илья", "Соболев", 19, 4.9));
        group.addStudent(new Student(2, "Алеша", "Попович", 19, 4.6));
        group.addStudent(new Student(3, "Добрыня", "Никитич", 21, 4.8));
        group.printInfo();
        group.getByNumber(3).printInfo();
        System.out.println(group.getAll());
        System.out.println(group.getCountByAge());
        System.out.println(group.getByMinScore(4.8));
        group.deleteStudent(group.getByNumber(3));
        group.printInfo();
    }

}