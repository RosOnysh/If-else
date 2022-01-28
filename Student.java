package iIElse;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void Method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты Одинаковы");
        } else {
            System.out.println("Студнеты не одинаковы");
        }
    }

    public static void Megthod2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имя студентво, курсы и оценки одинаковы");
                } else {
                    System.out.println("Имя студентов и курсы одинаковы,но оценки отличаються ");
                }
            } else {
                System.out.println("Имя студентов одинаковы,но курсы отличаються");
            }
        } else {
            System.out.println("Имена разные");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 5, 5.5);
        Student st2 = new Student("Ivan", 5, 10.5);
        Method1(st1,st2);
        Megthod2(st1,st2);


    }

}