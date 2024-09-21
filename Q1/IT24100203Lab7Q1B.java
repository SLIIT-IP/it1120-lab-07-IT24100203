import java.util.Scanner;
public class IT24100203Lab7Q1B {
  public static void main (String[]args) {
	  Scanner scanner = new Scanner(System.in);
	  double avg = 0, total = 0;
	  String grade = null;
	  
	  for(int i=1; i<=3; i++) {
		  System.out.println("Student "+i);
		  
			  System.out.print("Enter marks: ");
			  int mark1 = scanner.nextInt();
			  int mark2 = scanner.nextInt();
			  int mark3 = scanner.nextInt();
			  int mark4 = scanner.nextInt();
			  total = mark1+mark2+mark3+mark4;	
			  avg = total/4;
			   
			   if (avg>=75 && avg<=100 ) {
				   grade = "Distinction";
			   } else if (avg>=50 && avg<=74){
				   grade = "Credit";
			   } else {
				   grade = "Fail";
			   }	   
			   
			   System.out.println("Average is: "+avg);
			   System.out.println("Overall credit is: "+ grade);
		      System.out.println();  
		      
			 	  
	  }
	   
  }
}
