/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Student class (Abstract) 
*/
public abstract class Student extends Person {

    protected int basic_fee;
    protected int other_fee;
    protected String status;

    public Student()
    {
        super();
        this.basic_fee = 0;
        this.other_fee = 0;
        this.status = "/0";    
    }

    public Student(String name, String address, String phoneNo, String emailId,int basic_fee,int other_fee,String status) {
        super(name, address, phoneNo, emailId);//To call the parent constructor
        this.basic_fee = basic_fee;
        this.other_fee = other_fee;
        this.status = status;
    }

    public int getBasic_fee() {
        return this.basic_fee;
    }

    public void setBasic_fee(int basic_fee) {
        this.basic_fee = basic_fee;
    }

    public int getOther_fee() {
        return this.other_fee;
    }

    public void setOther_fee(int other_fee) {
        this.other_fee = other_fee;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //abstract method as asked
    abstract float calculateFee();

    public void display()
    {
        System.out.println(" ");
        System.out.println("Name: " + this.getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Phone No.: " + this.getPhoneNo());
        System.out.println("Email ID: " + this.getEmailId());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Basic Fee: " + this.getBasic_fee());
        System.out.println("Other Fee: " + this.getOther_fee());
        System.out.println("Fees to be paid: " + calculateFee());  
        System.out.println(" ");  
    } 
}
