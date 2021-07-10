/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Employee class abstract
*/
public abstract class Employee extends Person {

    protected float salary;
    protected int level;
    protected int working_hours;

    public Employee()
    {
        super();
        this.salary = 0f;
        this.level = 0;
        this.working_hours = 0;    
    }

    public Employee(String name, String address, String phoneNo, String emailId,float salary,int level,int working_hours) {
        super(name, address, phoneNo, emailId);//To call constructor of parent class
        this.salary = salary;
        this.level = level;
        this.working_hours = working_hours;
    }
    

    public float getSalary() {
		return this.salary;
	}

    public void setSalary(float salary ) {
		this.salary = salary ;
	}

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWorking_hours() {
        return this.working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
    
    abstract float calculateIncrement();
    abstract int calculatePromotedLevel();

    public void display()
    {
        System.out.println(" ");
        System.out.println("Name: " + this.getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Phone No.: : " + this.getPhoneNo());
        System.out.println("Email ID: " + this.getEmailId());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Level: " + this.getLevel());
        System.out.println("Working hours: " + this.getWorking_hours());
        System.out.println("Increment : " + calculateIncrement());  
        System.out.println("Updated Level : " + calculatePromotedLevel());  
        System.out.println(" ");  
    }
}
