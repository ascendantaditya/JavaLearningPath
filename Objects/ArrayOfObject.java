import java.util.Scanner;

public class ArrayOfObject {

    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter age for student " + (i + 1) + ":");
            int age = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, age);
        }

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }

        sc.close();
    }
}