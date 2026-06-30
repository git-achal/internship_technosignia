package console_based_student_management_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Save Students To File");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course : ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, age, course, marks);

                    service.addStudent(s);

                    System.out.println("Student Added Successfully.");

                    break;

                case 2:

                    service.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter ID : ");

                    int sid = sc.nextInt();

                    Student student = service.searchStudent(sid);

                    if (student != null)
                        System.out.println(student);
                    else
                        System.out.println("Student Not Found.");

                    break;

                case 4:

                    System.out.print("Enter ID : ");

                    int did = sc.nextInt();

                    service.deleteStudent(did);

                    break;

                case 5:

                    service.saveToFile();

                    break;

                case 6:

                    System.out.println("Thank You.");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
