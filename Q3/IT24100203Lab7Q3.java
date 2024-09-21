import java.util.Scanner;
public class IT24100203Lab7Q3 {
   public static void main (String[]args) {
	   Scanner scanner = new Scanner(System.in);
	   String mode = null;
	   double total=0, discount=0, amount=0;
	   for (int i=1; i<=5; i++) {
		   System.out.println("Customer "+i);
		   System.out.print("Enter total bill amount: ");
		   total = scanner.nextDouble();
		   scanner.nextLine();
		   
		   System.out.print("Enter mode of payment (c for cash, o for other): ");
		   mode = scanner.nextLine();
		   
		   
		   if (mode.equals("C") || mode.equals("c")) {
			   discount = total*5/100;
			   amount = total-discount;
			   System.out.println("Discount is: "+discount);
			   System.out.println("Amount to be paid: "+amount);
		   } else if (mode.equals("O") || mode.equals("o")) {
			   System.out.println("No discount applicable");
			   System.out.println("Amount to be paid: "+total);
		   } else {
			   System.out.println("Payment method is not valid");
		   }
		   
		   System.out.println();
	   }
   }
}
