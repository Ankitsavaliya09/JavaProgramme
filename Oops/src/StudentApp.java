
public class StudentApp {

	public static void main(String[] args) {
		 Student student = new Student();
	        
	        System.out.println("Before updating details:");
	        student.displayDetails();
	        
	        System.out.println("Updating details:");
	        student.updateDetails();
	        
	        System.out.println("After updating details:");
	        student.displayDetails();
	}

}
