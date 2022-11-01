public class Student {
    protected int number;
    protected String name;
    protected String lastName;
    protected int age;
    protected double averageScore;

    public Student(int number, String name, String lastName, int age, double averageScore) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }
    public void printInfo() {
        System.out.println(String.format("Номер зачетной книжки: %s \n" +
                "Имя: %s \n" +
                "Фамилия: %s \n" +
                "Возраст: %s \n" +
                "Средний балл: %s", this.number, this.name, this.lastName, this.age, this.averageScore));
    }

}