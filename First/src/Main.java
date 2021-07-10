/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Main class with which execution of the program starts
*/
import java.util.Scanner;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) throws Exception {
        
        sc = new Scanner(System.in);
        System.out.println("Enter the number of sponsored students: ");        
        int numSponsoredStudents = sc.nextInt();
        sc.nextLine();//To bring the cursor down after taking input of int .
        System.out.println("Enter the number of non sponsored students: ");
        int numNonSponsoredStudents = sc.nextInt();
        sc.nextLine();//To bring the cursor down after taking input of int .
        Sponsored sponsoredStudents[]; // declaration of array of sponsored students
        sponsoredStudents = new Sponsored[numSponsoredStudents]; // instantiation
        for(int i=0;i<numSponsoredStudents;i++)
        {
            sponsoredStudents[i] = new Sponsored();
        }
        NonSponsored nonSponsoredStudents[] = new NonSponsored[numNonSponsoredStudents]; // Declaration + instantiation
        for(int i=0;i<numNonSponsoredStudents;i++)
        {
            nonSponsoredStudents[i] = new NonSponsored();
        }
        String tempName = "\0";
        String tempAddress = "\0";
        String tempPhoneNo = "\0";
        String tempEmailId = "\0";
        int tempBasicFee = 0;
        int tempOtherFee = 0;
        String tempStatus = "\0"; //default
        for(int i=0;i<numSponsoredStudents;i++)
        {
            System.out.println("Enter the details of sponsored student " + (i+1) + ":" );
            System.out.println("Enter name: ");
            tempName = sc.nextLine();
            System.out.println("Enter address: ");
            tempAddress = sc.nextLine();
            System.out.println("Enter phone number: ");
            tempPhoneNo = sc.nextLine();
            System.out.println("Enter email ID: ");
            tempEmailId = sc.nextLine();
            System.out.println("Enter basic fee: ");
            tempBasicFee = sc.nextInt();
            System.out.println("Enter other fee: ");
            tempOtherFee = sc.nextInt();
            sc.nextLine();//To bring the cursor down after taking input of int .
            System.out.println("Enter status: ");            
            tempStatus = sc.nextLine();

            sponsoredStudents[i].setName(tempName);
            sponsoredStudents[i].setAddress(tempAddress);
            sponsoredStudents[i].setPhoneNo(tempPhoneNo);
            sponsoredStudents[i].setEmailId(tempEmailId);
            sponsoredStudents[i].setBasic_fee(tempBasicFee);
            sponsoredStudents[i].setOther_fee(tempOtherFee);
            sponsoredStudents[i].setStatus(tempStatus);
        }

        for(int i=0;i<numNonSponsoredStudents;i++)
        {
            System.out.println("Enter the details of non sponsored student " + (i+1) + ":" );
            System.out.println("Enter name: ");
            tempName = sc.nextLine();
            System.out.println("Enter address: ");
            tempAddress = sc.nextLine();
            System.out.println("Enter phone number: ");
            tempPhoneNo = sc.nextLine();
            System.out.println("Enter email ID: ");
            tempEmailId = sc.nextLine();
            System.out.println("Enter basic fee: ");
            tempBasicFee = sc.nextInt();
            System.out.println("Enter other fee: ");
            tempOtherFee = sc.nextInt();
            sc.nextLine();//To bring the cursor down after taking input of int .
            System.out.println("Enter status: ");
            tempStatus = sc.nextLine();

            nonSponsoredStudents[i].setName(tempName);
            nonSponsoredStudents[i].setAddress(tempAddress);
            nonSponsoredStudents[i].setPhoneNo(tempPhoneNo);
            nonSponsoredStudents[i].setEmailId(tempEmailId);
            nonSponsoredStudents[i].setBasic_fee(tempBasicFee);
            nonSponsoredStudents[i].setOther_fee(tempOtherFee);
            nonSponsoredStudents[i].setStatus(tempStatus);
        }
        // the calculate fee method is called in the display function and eventually displayed
        for(int i=0;i<numSponsoredStudents;i++)
        {
            System.out.println("The details of sponsored student " + (i+1) + " are : ");
            sponsoredStudents[i].display();
        }
        for(int i=0;i<numNonSponsoredStudents;i++)
        {
            System.out.println("The details of non sponsored student " + (i+1) + " are : ");
            nonSponsoredStudents[i].display();
        }

        System.out.println("Enter the number of faculty members: ");        
        int numFaculty = sc.nextInt();
        sc.nextLine();//To bring the cursor down after taking input of int .
        System.out.println("Enter the number of staff members: ");
        int numStaff = sc.nextInt();
        sc.nextLine();//To bring the cursor down after taking input of int .
        Faculty facultyMembers[] = new Faculty[numFaculty]; //Declaration + instantiation
        for(int i=0;i<numFaculty;i++)
        {
            facultyMembers[i] = new Faculty();
        }
        Staff StaffMembers[] = new Staff[numStaff]; // Declaration + instantiation
        for(int i=0;i<numStaff;i++)
        {
            StaffMembers[i] = new Staff();
        }
        tempName = "\0";
        tempAddress = "\0";
        tempPhoneNo = "\0";
        tempEmailId = "\0";
        float tempSalary = 0f;
        int tempLevel = 0;
        int tempWorkingHours = 0 ; //default
        for(int i=0;i<numFaculty;i++)
        {
            System.out.println("Enter the details of faculty member " + (i+1) + ":" );
            System.out.println("Enter name: ");
            tempName = sc.nextLine();
            System.out.println("Enter address: ");
            tempAddress = sc.nextLine();
            System.out.println("Enter phone number: ");
            tempPhoneNo = sc.nextLine();
            System.out.println("Enter email ID: ");
            tempEmailId = sc.nextLine();
            System.out.println("Enter Salary: ");
            tempSalary = sc.nextFloat();
            System.out.println("Enter Level: ");
            tempLevel = sc.nextInt();
            System.out.println("Enter Working hours: ");            
            tempWorkingHours = sc.nextInt();
            sc.nextLine();//to bring cursor down
        
            facultyMembers[i].setName(tempName);
            facultyMembers[i].setAddress(tempAddress);
            facultyMembers[i].setPhoneNo(tempPhoneNo);
            facultyMembers[i].setEmailId(tempEmailId);
            facultyMembers[i].setSalary(tempSalary);
            facultyMembers[i].setLevel(tempLevel);
            facultyMembers[i].setWorking_hours(tempWorkingHours);
        }

        for(int i=0;i<numStaff;i++)
        {
            System.out.println("Enter the details staff member " + (i+1) + ":" );
            System.out.println("Enter name: ");
            tempName = sc.nextLine();
            System.out.println("Enter address: ");
            tempAddress = sc.nextLine();
            System.out.println("Enter phone number: ");
            tempPhoneNo = sc.nextLine();
            System.out.println("Enter email ID: ");
            tempEmailId = sc.nextLine();
            System.out.println("Enter Salary: ");
            tempSalary = sc.nextFloat();
            System.out.println("Enter Level: ");
            tempLevel = sc.nextInt();
            System.out.println("Enter Working hours: ");
            tempWorkingHours = sc.nextInt();
            sc.nextLine();
        
            StaffMembers[i].setName(tempName);
            StaffMembers[i].setAddress(tempAddress);
            StaffMembers[i].setPhoneNo(tempPhoneNo);
            StaffMembers[i].setEmailId(tempEmailId);
            StaffMembers[i].setSalary(tempSalary);
            StaffMembers[i].setLevel(tempLevel);
            StaffMembers[i].setWorking_hours(tempWorkingHours);
        }
        // the calculate increment and calculate promoted level methods are called in the display method and eventually displayed
        for(int i=0;i<numFaculty;i++)
        {
            System.out.println("The details of faculty member " + (i+1) + " are : ");
            facultyMembers[i].display();
        }
        for(int i=0;i<numStaff;i++)
        {
            System.out.println("The details of staff member " + (i+1) + " are : ");
            StaffMembers[i].display();
        }
    }
}
