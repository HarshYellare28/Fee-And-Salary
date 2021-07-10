/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Non sponsored class 
*/
public class NonSponsored extends Student {

    public NonSponsored(){
        super();
    }
    public NonSponsored(String name, String address, String phoneNo, String emailId, int basic_fee, int other_fee,
            String status) {
        super(name, address, phoneNo, emailId, basic_fee, other_fee, status);
    }

    float calculateFee() {
        float ret_val = (0.7f)*basic_fee + other_fee ;
        return ret_val;
    }    
}
