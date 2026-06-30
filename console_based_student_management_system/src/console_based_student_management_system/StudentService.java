package console_based_student_management_system;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Records Found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int id) {

        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }

        return null;
    }

    public void deleteStudent(int id) {

        Student s = searchStudent(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Student Deleted Successfully.");
        } else {
            System.out.println("Student Not Found.");
        }
    }

	public void saveToFile() {
		

		    try {

		        FileWriter writer = new FileWriter("students.txt");

		        writer.write("ID\tNAME\tAGE\tCOURSE\tMARKS\n");
		        writer.write("-------------------------------------------\n");

		        for(Student s : students) {

		            writer.write(s.toString() + "\n");

		        }

		        writer.close();

		        System.out.println("Students saved successfully into students.txt");

		    } catch(IOException e) {

		        System.out.println("Error : " + e.getMessage());

		    }

		}
		
	
}
