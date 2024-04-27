
public class Trainer {
	int id;
	String name;
	String subject;
	
	void Trainer1(int id){
		System.out.println("Id Intilized.");
		System.out.println("Id : "+id+", Name: "+name+", Subject: "+subject);
	}
	
	void Trainer1(int id,String name){
		System.out.println("ID, Name Intilized.");
		System.out.println("Id : "+id+", Name: "+name+", Subject: "+subject);
	}
	
	void Trainer1(int id,String name,String subject){
		System.out.println("ID, Name, Subject Intilized.");
		System.out.println("Id : "+id+", Name: "+name+", Subject: "+subject);
	}
	
	void tech() {
		System.out.println("Started Teaching...!");
	}
	
	void takeAttendance() {
		System.out.println("Attendance Taken....!");
	}
	
	void space() {
		System.out.println("===========================================");
	}
}
