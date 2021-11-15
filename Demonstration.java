package exceptions;

import java.util.Scanner;

public class Demonstration {

	public static void main(String[] args) throws Exception {
		Month obj = new Month();
		Scanner input = new Scanner(System.in);
        System.out.println("Hello welcome!!!");
        System.out.println("Enter the Month");
        int monthh = input.nextInt();
        obj.setMonthNumber(monthh);
        System.out.println("The month's Name is:");
        System.out.println(obj.getMonthName(monthh));
        
	}

}
