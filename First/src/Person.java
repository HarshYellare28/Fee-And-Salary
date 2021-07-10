/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Person class (abstract)
*/
public abstract class Person {
    protected String name;
    protected String address;
    protected String phoneNo;
    protected String emailId;

    public Person()//Default Constructor
    {
        this.name = "/0";
        this.address = "/0";
        this.phoneNo = "/0";
        this.emailId = "/0";
    }

    public Person(String name,String address,String phoneNo,String emailId)//Parameterized Constructor
    {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }  
}
