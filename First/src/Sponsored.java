/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Sponsored class 
*/
public class Sponsored extends Student {

    public Sponsored(){
        super();
    }
    
    public Sponsored(String name, String address, String phoneNo, String emailId, int basic_fee, int other_fee,
            String status) {
        super(name, address, phoneNo, emailId, basic_fee, other_fee, status);
    }

    float calculateFee() {
        float ret_val = 0f;
        switch(status) {
            case "Freshman":
                ret_val = basic_fee + 1*other_fee;
                break;
            case "Sophomore":
                ret_val = basic_fee + 2*other_fee;  
                break;
            case "Junior":
                ret_val = basic_fee + 3*other_fee;
                break;
            case "Senior":
                ret_val = basic_fee + 4*other_fee;
                break;
            default :
                System.out.println("Invalid status");
                break;
        }        
        return ret_val;
    }
}
