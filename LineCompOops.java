package lineComparisionOops;

import java.util.Scanner;

public class LineCompOops {
	private static double lengthCalc(double x1, double y1, double x2, double y2) {
		double length = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		return length;
	}
	/*it will check for equality of two lines*/
	@SuppressWarnings("removal")
	private static int lengthEquality(double length, double length1) {
		int flag=0;
		Double len = new Double(length);
		Double len1 = new Double(length1);
		if (len.equals(len1)) {
			flag = 1;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation prblm");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1, y1 and x2, y2");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double length = lengthCalc(x1, y1, x2, y2);
		System.out.println("Enter a1, b1 and a2, b2 for line 2");
		double a1 = scanner.nextDouble();
		double b1 = scanner.nextDouble();
		double a2 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		double length1 = lengthCalc(a1, b1, a2, b2);
		//if flag equals 1 then line are equal otherwise not equal
		int flag = lengthEquality(length, length1);
		scanner.close();
	}


}
