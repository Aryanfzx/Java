import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListDemo {

    // Student class with rollno, name, and age
    static class Student {
        int rollno;
        String name;
        int age;

        // Constructor
        public Student(int rollno, String name, int age) {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
        }

        // Optional: toString() method for clean output
        @Override
        public String toString() {
            return "Roll No: " + rollno + ", Name: " + name + ", Age: " + age;
        }
    }

    public static void main(String[] args) {

        // Step 2: Create several Student objects
        Student s1 = new Student(101, "Amit Kumar", 20);
        Student s2 = new Student(102, "Priya Sharma", 19);
        Student s3 = new Student(103, "Rahul Singh", 21);
        Student s4 = new Student(104, "Sneha Patel", 20);

        // Step 3: Store Student objects in ArrayList
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        // Step 4: Use Iterator to traverse and display student details
        System.out.println("Student Details:");
        System.out.println("----------------");

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student); // calls toString() automatically
        }
    }
}