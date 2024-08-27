import java.util.Scanner;

class StudentData {
    String studentName;
    String panNumber;
    long aadharNumber;
    int mobileNumber; 
    String emailAddress;
    StudentData[] studentArray;

    // Constructor
    public StudentData(String studentName, String panNumber, long aadharNumber, int mobileNumber, String emailAddress) {
        this.studentName = studentName;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    // Default constructor
    public StudentData() {
    }

    // Method to collect data from user
    int collectStudentData(int numberOfStudents) {
        studentArray = new StudentData[numberOfStudents];
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student Name: ");
            String studentName = inputScanner.next();
            System.out.print("PAN Number: ");
            String panNumber = inputScanner.next();
            System.out.print("Aadhar Number: ");
            long aadharNumber = inputScanner.nextLong();
            System.out.print("Mobile Number: ");
            int mobileNumber = inputScanner.nextInt();
            System.out.print("Email Address: ");
            String emailAddress = inputScanner.next();
            studentArray[i] = new StudentData(studentName, panNumber, aadharNumber, mobileNumber, emailAddress);
        }
        inputScanner.close(); // Close the Scanner
        return 1; 
    }

    // Method to display data
    void displayStudentData(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            System.out.println("Student Name: " + studentArray[i].studentName);
            System.out.println("PAN Number: " + studentArray[i].panNumber);
            System.out.println("Aadhar Number: " + studentArray[i].aadharNumber);
            System.out.println("Mobile Number: " + studentArray[i].mobileNumber);
            System.out.println("Email Address: " + studentArray[i].emailAddress);
            System.out.println();
        }
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = inputScanner.nextInt();
        StudentData studentDataManager = new StudentData();
        studentDataManager.collectStudentData(numberOfStudents);
        studentDataManager.displayStudentData(numberOfStudents);
        inputScanner.close(); // Close the Scanner
    }
}
