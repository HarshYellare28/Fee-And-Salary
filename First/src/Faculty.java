/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Faculty class 
*/
public class Faculty extends Employee{

    public Faculty(){
        super();
    }

    public Faculty(String name, String address, String phoneNo, String emailId, float salary, int level,
            int working_hours) {
        super(name, address, phoneNo, emailId, salary, level, working_hours);
    }

    float calculateIncrement() {
        float ret_val = 0f;
        ret_val = (1.25f)*salary; 
        return ret_val;
    }

    int calculatePromotedLevel() {
        int ret_val = level;
        if(working_hours > 1000)
        {
            level++;
            ret_val = level;
        }
        return ret_val;
    }    
}
