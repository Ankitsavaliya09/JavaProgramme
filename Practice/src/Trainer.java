
public class Trainer {
	int id;
	String name;
	String subject;
	
	void Trainer(int id){
		System.out.println("Id : "+id+", Name: "+name+", Subject: "+subject);
	}
	
	void Trainer(int id,String name){
		System.out.println("Id : "+id+", Name: "+name+", Subject: "+subject);
	}
	
	void Trainer(int id,String name,String subject){
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


