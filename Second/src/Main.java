/*
        NAME: HARSH YELLARE
        ROLL.NO: BT19CSE124
        ASSIGNMENT NUMBER: 3
        QUESTION NUMBER: 1
        DATE OF SUBMISSION: 29-03-2021

        DESCRIPTION : Main class with which execution starts 
*/

import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        System.out.println("Enter the number of Accounts: ");        
        int numAccounts = sc.nextInt();
        sc.nextLine();//To bring the cursor down after taking input of int .
        
        Cibil arrayOfAccounts[]; // declaration of array of accounts
        
        arrayOfAccounts = new Cibil[numAccounts]; // instantiation
        for(int i=0;i<numAccounts;i++)
        {
            arrayOfAccounts[i] = new Cibil();
        }
        
        String tempAccountNo = "\0";
        float tempBalance = 0f;
        float tempAvailableAmount = 0f;
        float tempOutstandingAmount = 0f;
        int tempNumMonths = 0;
        float tempAmountPaidMonthly[];
        int tempNoOfCreditApplications = 0; 
        int tempNoOfTimesAccepted = 0;
        for(int i=0;i<numAccounts;i++)
        {
            System.out.println("Enter the details of Account " + (i+1) + ":" );
            System.out.println("Enter Account number: ");
            tempAccountNo = sc.nextLine();
            System.out.println("Enter balance: ");
            tempBalance = sc.nextFloat();
            System.out.println("Enter available loan limit: ");
            tempAvailableAmount = sc.nextFloat();
            System.out.println("Enter outstanding loan amount: ");
            tempOutstandingAmount = sc.nextFloat();
            System.out.println("Enter number of months since when repaying initiated: ");
            tempNumMonths = sc.nextInt();
            System.out.println("Enter the repay status for each month (Start entering from month 1 to month " + tempNumMonths + ": "); 
            tempAmountPaidMonthly = new float[tempNumMonths];
            for(int j = 0; j < tempNumMonths ; j++ )
            {
                tempAmountPaidMonthly[j] = sc.nextFloat();
            }
            System.out.println("Enter number of credit applications: ");            
            tempNoOfCreditApplications = sc.nextInt();
            System.out.println("Enter number of accepted applications: ");            
            tempNoOfTimesAccepted = sc.nextInt();
            sc.nextLine();//To bring the cursor down after taking input of int .
            
            arrayOfAccounts[i].setAccountNo(tempAccountNo);
            arrayOfAccounts[i].setBalance(tempBalance);
            arrayOfAccounts[i].setOutstandingLoanAmount(tempOutstandingAmount);
            arrayOfAccounts[i].setAvailableLoanLimit(tempAvailableAmount);
            arrayOfAccounts[i].setNumMonths(tempNumMonths);
            arrayOfAccounts[i].setAmountPaidMonthly(tempAmountPaidMonthly);
            arrayOfAccounts[i].setNoOfCreditApplications(tempNoOfCreditApplications);
            arrayOfAccounts[i].setNoOfTimesAccepted(tempNoOfTimesAccepted);
        }
        for(int i=0;i<numAccounts;i++)
        {
            System.out.println("The details , cibil score and eligibility status of account " + (i+1) + " are : ");
            arrayOfAccounts[i].display();
        }
    }
}
