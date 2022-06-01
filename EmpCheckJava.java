package employeeDetails;

public class EmpCheckJava {
	public static void main(String[] args) {
		System.out.println("welcome to Employee wage computation program\n");
        int isFulltime = 1;
        int EmpRatePerHour = 20;
        int emphrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFulltime) {
            System.out.println("Employee is present");
            emphrs = 8;
        } else {
            System.out.println("Employee is absent");
            emphrs = 0;
        }
        System.out.print("Today's wage is: ");
        empwage = emphrs * EmpRatePerHour;
        System.out.print("Rs."+empwage);
	}
	public static void main1(String[] args) {
		System.out.println("welcome to Employee wage computation program\n");
        int isFullTime = 1;
        int isPartTime = 2;
        int EmpRatePerHour = 20;
        int emphrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime) {
            System.out.println("Employee is present full time");
            emphrs = 8;
        } else if (empCheck == isPartTime) {
            System.out.println("Employee is present part time");
            emphrs = 4;
        }else {
            System.out.println("Employee is absent");
        }
        empwage = emphrs * EmpRatePerHour;
        System.out.println(empwage);
    
	}
	public static void main2(String[] args) {
		 double n = Math.floor(Math.random()*10)%2;
	     if (n==1){
	         System.out.println("Employee is present.");
	     }else{
	         System.out.println("Employee is absent");
	     }
	}

}
