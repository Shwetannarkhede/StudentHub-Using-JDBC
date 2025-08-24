import java.util.Scanner;

import service.StudentService;

public class MainApp {
	
	
	    public static void main(String[] args) throws Exception {
	        StudentService service = new StudentService();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n===== Student Records Manager =====");
	            System.out.println("[1] -> Add Student");
	            System.out.println("[2] -> Update Student");
	            System.out.println("[3] -> Delete Student");
	            System.out.println("[4] -> View Student by ID");
	            System.out.println("[5] -> View All Students");
	            System.out.println("[6] -> Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            switch (ch) {
	                case 1: service.addStudent(); break;
	                case 2: service.updateStudent(); break;
	                case 3: service.deleteStudent(); break;
	                case 4: service.viewById(); break;
	                case 5: service.viewAllStudents(); break;
	                case 6:
	                    System.out.println(" Exit...");
	                    return;
	                default:
	                    System.out.println(" Invalid Choice!");
	            }
	        }
	    }
	}


