package EmployeeWageWhile;

public class EmployeeWageUC6 {

	public static final int Part_Time = 1; 
	public static final int Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Of_Working_Days = 20;
	public static final int Max_Hrs_In_Month = 100;
	
	public static void main(String[] args) {
		int empHrs = 0, TotalEmpHrs = 8, TotalWorkingDays = 0;
		
		while (TotalEmpHrs <=Max_Hrs_In_Month && TotalWorkingDays < Num_Of_Working_Days) {
			TotalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random()* 10) % 3;
        switch (empCheck){
        
		case Part_Time:	
			empHrs = 4;
		    break;

		case Full_Time:
			empHrs = 8;
		    break;
		default:
		    empHrs= 0;
		}
	    TotalEmpHrs += empHrs; 
	    System.out.println("Day#:" +TotalWorkingDays + " Emp Hr: " +empHrs);
	    }
		int TotalEmpWage = TotalEmpHrs*Emp_Rate_Per_Hour;
		System.out.println("Total Emp Wage: " +TotalEmpWage);
	}
}
