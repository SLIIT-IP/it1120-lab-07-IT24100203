import java.util.Scanner;
public class IT24100203Lab7Q1A {
   public static void main (String[]args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter marks for four subjects: ");
	   
	   int total = 0,mark = 0;
	   double avg = 0;
	   for (int i=1; i<5; i++) {
		   System.out.print("Enter subject Mark "+i+":");
		   mark = scanner.nextInt();
		   total = total+mark;
	   }
	   avg = total/4.0;
	   
	   String grade ;
	   if (avg>=75 && avg<=100 ) {
		   grade = "Distinction";
	   } else if (avg>=50 && avg<=74){
		   grade = "Credit";
	   } else {
		   grade = "Fail";
	   }	   
	   System.out.println();
	   System.out.println("Average is: "+avg);
	   System.out.println("Overall credit is: "+ grade);
   }
}
