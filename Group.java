import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    protected ArrayList<Student> students;
    protected String groupNumber;

    public Group( ArrayList<Student> student, String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = student;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }
    public Student getByNumber(int serialNumber) {
        for (Student student: this.students) {
            if (student.number == serialNumber) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }

    public List<Student> getAll() {
        return this.students;
    }

    public Map<Integer, Integer> getCountByAge() {
        Map<Integer, Integer> map = new HashMap<>();
        for(Student student : this.students) {
            map.putIfAbsent(student.age, 0);
            map.put(student.age, map.get(student.age) + 1);
        }
        return map;
    }

    public List<Student> getByMinScore(double score) {
        ArrayList<Student> out = new ArrayList<>();
        for(Student student : this.students) {
            if (student.averageScore >= score) {
                out.add(student);
            }
        }
        return out;
    }
    public void printInfo(){
        System.out.println(String.format("Группа: %s", this.groupNumber));
        for(Student student: this.students) {
            student.printInfo();
            System.out.println("");
        }
    }
}
