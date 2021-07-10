/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : NCibil class 
*/
public class Cibil extends Account {
    public Cibil()
    {
        super();
    }

    public Cibil(String accountNo, float balance , float outstandingLoanAmount,float availableLoanLimit 
                , int numMonths ,float amountPaidMonthly[] , int noOfCreditApplications , int noOfTimesAccepted )
    {
        super(accountNo,balance,outstandingLoanAmount,availableLoanLimit,numMonths,amountPaidMonthly,noOfCreditApplications,noOfTimesAccepted);
    }

    public float calculateCibil()
    {
        float ret_val = 0;
        float creditHistory = 0f;
        float creditUtilization = 0f;
        float creditApplications = 0f;
        int temp1 = numMonths-1;
        
        int temp2 = temp1 - 4;
        int countPaid = 0;
        while(temp1>=temp2)
        {
            if(amountPaidMonthly[temp1] != 0f)
            {
                countPaid++;
            }
            temp1--;
        }
        creditHistory = 400*((float)countPaid/5f); // 40% of 1000 is 400
        creditUtilization = 350*(outstandingLoanAmount/availableLoanLimit); //35% of 1000 is 350
        creditApplications = 250*((float)noOfTimesAccepted/(float)noOfCreditApplications); //25% of 1000 is 250
        ret_val = creditHistory + creditUtilization + creditApplications ;
        return ret_val;
    }

    public boolean isEligible()
    {
        boolean ret_val = false;
        float Cibil = calculateCibil();
        if(Cibil>=600) // Assumption: Canditate is eligible if Cibil is greater than or equal to 600
        {
            ret_val = true;
        }
        return ret_val;
    }

    public void display()
    {
        System.out.println(" ");
        System.out.println("Account No.: " + this.getAccountNo());
        System.out.println("Current Balance: " + this.getBalance());
        System.out.println("Outstanding Loan Limit: " + this.getOutstandingLoanAmount());
        System.out.println("Available Loan Limit: " + this.getAvailableLoanLimit());
        System.out.println("Number of Months since repaying started: " + this.getNumMonths());
        System.out.println("Repaying Status: ");
        for(int i=0;i<getNumMonths();i++)
        {
            System.out.print(amountPaidMonthly[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Credit applications: " + this.getNoOfCreditApplications());
        System.out.println("Number of applications accepted : " + this.getNoOfTimesAccepted());  
        System.out.println("Cibil Score: " + calculateCibil());  
        if(isEligible())
        {
            System.out.println("This account is Eligible.");
        }
        else
        {
            System.out.println("Not Eligible");
        }
        System.out.println(" ");
    }
}
