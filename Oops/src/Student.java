import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollNumber;
    
    public void updateDetails() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your name: ");
        name = scan.nextLine();
        
        System.out.print("Enter Your age: ");
        age = scan.nextInt();
        
        System.out.print("Enter Your roll number: ");
        rollNumber = scan.nextInt();
        scan.close();
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}


