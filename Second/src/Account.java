/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Abstract class Account 
*/
public abstract class Account {
    protected String accountNo ;
    protected float balance ;
    protected float availableLoanLimit;
    protected float outstandingLoanAmount;
    protected int numMonths;
    // ASSUMPTION : Maximum number of months since when repayment of loan has begun is 120.(20 years)
    protected static final int NUM_MONTHS = 240 ;  
    protected float amountPaidMonthly[];
    protected int noOfCreditApplications;
    protected int noOfTimesAccepted;

    public Account() // Default Constructor
    {
        accountNo = "/0";
        balance = 0f;
        availableLoanLimit = 0f;
        outstandingLoanAmount = 0f;
        numMonths = 0;
        amountPaidMonthly = new float[NUM_MONTHS];
        for(int i=0;i<NUM_MONTHS;i++)
        {
            amountPaidMonthly[i] = 0f;
        }
        noOfCreditApplications = 0;
        noOfTimesAccepted = 0;
    }

    // Parameterized Constructor
    public Account(String accountNo, float balance , float outstandingLoanAmount,float availableLoanLimit 
                , int numMonths ,float amountPaidMonthly[] , int noOfCreditApplications , int noOfTimesAccepted ) 
    {
        this.accountNo = accountNo;
        this.balance = balance;
        this.availableLoanLimit = outstandingLoanAmount;
        this.outstandingLoanAmount = availableLoanLimit;
        this.numMonths = numMonths;
        this.amountPaidMonthly = new float[numMonths];
        for(int i=0;i<numMonths;i++)
        {
            this.amountPaidMonthly[i] = amountPaidMonthly[i];
        }
        this.noOfCreditApplications = noOfCreditApplications;
        this.noOfTimesAccepted = noOfTimesAccepted;
    }

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo ) {
		this.accountNo = accountNo ;
	}

	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance ) {
		this.balance = balance;
	}

	public float getAvailableLoanLimit() {
		return this.availableLoanLimit;
	}

	public void setAvailableLoanLimit(float availableLoanLimit) {
		this.availableLoanLimit = availableLoanLimit;
	}

	public float getOutstandingLoanAmount() {
		return this.outstandingLoanAmount;
	}

	public void setOutstandingLoanAmount(float outstandingLoanAmount) {
		this.outstandingLoanAmount = outstandingLoanAmount;
	}

    public int getNumMonths() {
        return this.numMonths;
    }

    public void setNumMonths(int numMonths) {
        this.numMonths = numMonths;
    }

	public float[] getAmountPaidMonthly() {
		return this.amountPaidMonthly;
	}

	public void setAmountPaidMonthly(float amountPaidMonthly[]) {
		for(int i=0;i<amountPaidMonthly.length;i++)
        {
            this.amountPaidMonthly[i] = amountPaidMonthly[i];
        }
	}

	public int getNoOfCreditApplications() {
		return this.noOfCreditApplications;
	}

	public void setNoOfCreditApplications(int noOfCreditApplications) {
		this.noOfCreditApplications = noOfCreditApplications;
	}

	public int getNoOfTimesAccepted() {
		return this.noOfTimesAccepted;
	}

	public void setNoOfTimesAccepted(int noOfTimesAccepted) {
		this.noOfTimesAccepted = noOfTimesAccepted;
	}

}
