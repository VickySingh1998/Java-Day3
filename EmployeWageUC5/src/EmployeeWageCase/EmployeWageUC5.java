package EmployeeWageCase;

public class EmployeWageUC5 {
	
	public static final int Part_Time = 1; 
	public static final int Full_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Of_Working_Days = 2;
	
	public static void main(String[] args) {
		int empHrs = 0, empWage = 0, TotalEmpWage = 0;
		
		for (int day=0; day < Num_Of_Working_Days; day++) {
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
	    empWage = empHrs*Emp_Rate_Per_Hour;
	    TotalEmpWage += empWage; 
	    System.out.println("Emp Wage: " +empWage);
	    }
		System.out.println("Total Emp Wage: " +TotalEmpWage);
	}
}
